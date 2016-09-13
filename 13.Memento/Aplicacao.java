package memento;

public class Aplicacao {

	public static void main(String[] args) {
		Operacao op1 = new Operacao();
		
		op1.addElementoOperacao("1");
		op1.addElementoOperacao("som");
		op1.addElementoOperacao("2");		
		op1.addElementoOperacao("mul");
		op1.addElementoOperacao("4");
		
		op1.desfazer();

	}

}
