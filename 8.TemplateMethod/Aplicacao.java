package templateMethod;

public class Aplicacao {

	public static void main(String[] args) {
		LeitorTexto leitor1 = new LeitorMaiusculo();
		leitor1.atribuiTexto("Texto mai�sculo");
		
		LeitorTexto leitor2 = new LeitorMinusculo();
		leitor2.atribuiTexto("Texto min�sculo");
		
		LeitorTexto leitor3 = new LeitorDuplicador();
		leitor3.atribuiTexto("Texto duplicado");
		
		LeitorTexto leitor4 = new LeitorInverso();
		leitor4.atribuiTexto("Texto invertido");
	}

}
