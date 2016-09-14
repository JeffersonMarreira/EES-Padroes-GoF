package br.trabalhopadroes5.chainofresponsability;

public class Slot3 extends MaquinaVendaChain{
	
	public Slot3() {
		super(IDSlots.slot3);
	}

	@Override
	protected void receberMoedas(double valor) {
		if(valor == 0.10){
			valorTotal+=valor;	
			System.out.println("Pagamento R$"+valor+" recebido no slot 3.");
			
		}
		else {
			System.out.println("Valor R$"+valor+" nao pode ser recebido pelo slot 2.");
		}
		
	}
	
	

}
