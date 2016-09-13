package memento;

public class Operacao {
	private String elementosOperacao;
	OperacaoCareTaker caretaker;
	private int resultado;
	
	public Operacao() {
		elementosOperacao = "";
		caretaker = new OperacaoCareTaker();
		resultado = 0;
	}
	
	//Adiciona um novo elemento (operador ou operando) à operação
	public void addElementoOperacao(String elemento) {
		if(elementosOperacao == "") {
			elementosOperacao = elemento;
		} else {
			elementosOperacao += "," + elemento;
		}
		
		//Guarda estado da operação
		caretaker.addMemento(new OperacaoMemento(elementosOperacao));
		System.out.println(calculaResultado());
	}
	
	//Deleta último elemento da operação
	public void desfazer() {
		elementosOperacao = caretaker.getEstadoAnterior();
		System.out.println(calculaResultado());
	}

	//Percorre todos os elementos da operação montando uma String
	//do cálculo e efetua o cálculo da operação
	public String calculaResultado() {
		
		String operadorAtual = new String(); //Guarda o último operador encontrado
		String[] arrayOperacoes = elementosOperacao.split(","); //Guarda os elementos da operação em array
		String operacaoCompleta = new String(); //String inteira da operação
		resultado = 0; //Resultado da operação
		
		//Percorre todos os elementos da operação
		for (String elemento : arrayOperacoes) {
			//Verifica qual o tipo da operação foi digitada
			if (elemento.toLowerCase().equals("som")) {
				operacaoCompleta += "+"; //Adiciona o operador a String da operação
				operadorAtual = "som"; //Salva o operador atual utilizado

			} else if (elemento.toLowerCase().equals("sub")) {
				operacaoCompleta += "-";
				operadorAtual = "sub";

			} else if (elemento.toLowerCase().equals("mul")) {
				operacaoCompleta += "*";
				operadorAtual = "mul";
				
			} else if (elemento.toLowerCase().equals("div")) {
				operacaoCompleta += "/";
				operadorAtual = "div";
				
			} else {
				operacaoCompleta += elemento; //Adiciona o operando a String
				
				//Verifica qual o último operador salvo e adiciona
				//operando à variável resultado conforme ele.
				//Ex.: Se a operação for de soma o operando será somado à variável resultado
				if(operadorAtual.equals("som")) this.resultado += Integer.parseInt(elemento);
				else if(operadorAtual.equals("sub")) this.resultado -= Integer.parseInt(elemento);
				else if (operadorAtual.equals("mul")) this.resultado *= Integer.parseInt(elemento);
				else if (operadorAtual.equals("div")) this.resultado /= Integer.parseInt(elemento);
				else this.resultado += Integer.parseInt(elemento);
			}
		}
		//Recupera o último elemento da lista para verificar se a operação pode ou não ser calculada
		String ultimoElemento = operacaoCompleta.substring(operacaoCompleta.length() - 1);
		if(ultimoElemento.equals("+") || ultimoElemento.equals("-") || ultimoElemento.equals("*") || ultimoElemento.equals("/")) {
			return operacaoCompleta.toString() + " = Não é possível efetuar o cálculo";
			
		}else {
			return operacaoCompleta.toString() + " = " + this.resultado;
		}
	}
}
