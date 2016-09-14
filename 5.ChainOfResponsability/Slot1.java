package br.trabalhopadroes5.chainofresponsability;

public class Slot1 extends MaquinaVendaChain{	
	
	public Slot1() {
		super(IDSlots.slot1);
	}

	@Override
	protected void receberMoedas(double valor) {
		if(valor == 0.01){
			valorTotal+=valor;			
			System.out.println("Pagamento R$"+valor+" recebido no slot 1.");
						
		}
		else {
			System.out.println("Valor R$"+valor+" nao pode ser recebido pelo slot 1.");
		}
		
	}
	
	
}
