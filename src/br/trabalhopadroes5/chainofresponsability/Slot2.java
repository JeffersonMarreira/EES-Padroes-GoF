package br.trabalhopadroes5.chainofresponsability;

public class Slot2 extends MaquinaVendaChain{
	
	public Slot2() {
		super(IDSlots.slot2);
	}

	@Override
	protected void receberMoedas(double valor) {
		if(valor == 0.05){
			valorTotal+=valor;	
			System.out.println("Pagamento R$"+valor+" recebido no slot 2.");
			
		}
		else {
			System.out.println("Valor R$"+valor+" nao pode ser recebido pelo slot 2.");
		}
		
	}
	
	

}
