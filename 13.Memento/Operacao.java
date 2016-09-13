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
	
	//Adiciona um novo elemento (operador ou operando) � opera��o
	public void addElementoOperacao(String elemento) {
		if(elementosOperacao == "") {
			elementosOperacao = elemento;
		} else {
			elementosOperacao += "," + elemento;
		}
		
		//Guarda estado da opera��o
		caretaker.addMemento(new OperacaoMemento(elementosOperacao));
		System.out.println(calculaResultado());
	}
	
	//Deleta �ltimo elemento da opera��o
	public void desfazer() {
		elementosOperacao = caretaker.getEstadoAnterior();
		System.out.println(calculaResultado());
	}

	//Percorre todos os elementos da opera��o montando uma String
	//do c�lculo e efetua o c�lculo da opera��o
	public String calculaResultado() {
		
		String operadorAtual = new String(); //Guarda o �ltimo operador encontrado
		String[] arrayOperacoes = elementosOperacao.split(","); //Guarda os elementos da opera��o em array
		String operacaoCompleta = new String(); //String inteira da opera��o
		resultado = 0; //Resultado da opera��o
		
		//Percorre todos os elementos da opera��o
		for (String elemento : arrayOperacoes) {
			//Verifica qual o tipo da opera��o foi digitada
			if (elemento.toLowerCase().equals("som")) {
				operacaoCompleta += "+"; //Adiciona o operador a String da opera��o
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
				
				//Verifica qual o �ltimo operador salvo e adiciona
				//operando � vari�vel resultado conforme ele.
				//Ex.: Se a opera��o for de soma o operando ser� somado � vari�vel resultado
				if(operadorAtual.equals("som")) this.resultado += Integer.parseInt(elemento);
				else if(operadorAtual.equals("sub")) this.resultado -= Integer.parseInt(elemento);
				else if (operadorAtual.equals("mul")) this.resultado *= Integer.parseInt(elemento);
				else if (operadorAtual.equals("div")) this.resultado /= Integer.parseInt(elemento);
				else this.resultado += Integer.parseInt(elemento);
			}
		}
		//Recupera o �ltimo elemento da lista para verificar se a opera��o pode ou n�o ser calculada
		String ultimoElemento = operacaoCompleta.substring(operacaoCompleta.length() - 1);
		if(ultimoElemento.equals("+") || ultimoElemento.equals("-") || ultimoElemento.equals("*") || ultimoElemento.equals("/")) {
			return operacaoCompleta.toString() + " = N�o � poss�vel efetuar o c�lculo";
			
		}else {
			return operacaoCompleta.toString() + " = " + this.resultado;
		}
	}
}
