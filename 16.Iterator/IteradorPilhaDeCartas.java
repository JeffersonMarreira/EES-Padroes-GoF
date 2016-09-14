
public class IteradorPilhaDeCartas implements IteradorInterface{

	protected Carta[] pilha;
	protected int contador;

	protected IteradorPilhaDeCartas(Carta[] pilha) {
		this.pilha = pilha;
	}

	@Override
	public boolean estaVazia() {
		return pilha.length ==0;
	}

	@Override
	public void remover(Carta carta) {
		Carta[] vetorAux = new Carta[pilha.length*2];
		int index = 0;
		for(int i = 0; i < pilha.length; i++){
			if(!pilha[i].equals(carta)){
				vetorAux[index] = pilha[i];
				index++;
			}
		}
		this.pilha = vetorAux;
	}

	@Override
	public void adicionar(Carta carta) {

		Carta[] vetorAux = new Carta[pilha.length*2];
		int index = 0;
		for(int i = 0; i < pilha.length; i++){
			if(i==pilha.length-1)
				vetorAux[index] = carta;
			else
				vetorAux[index] = pilha[i];

			index++;
		}
		this.pilha = vetorAux;

		//this.pilha[pilha.length] = carta;
	}

	@Override
	public Carta proximo() {
		return pilha[0];
	}

	@Override
	public void first() {
		contador = 0;
	}

	/*
	@Override
	public void colocarNoFinal(Carta[] cartas) {
		for (int i=0; i<cartas.length;i++){
			remover(cartas[i]);
		}

		for (int j=0; j<cartas.length;j++){
			adicionar(cartas[j]);
		}

	}*/

	@Override
	public void colocarNoFinal(Carta carta) {
		remover(carta);
		adicionar(carta);
	}

	@Override
	public void next() {
		contador++;
	}



	@Override
	public boolean isDone() {
		return contador == pilha.length;
	}

	@Override
	public Carta currentItem() {
		if (isDone()) {
			contador = pilha.length - 1;
		} else if (contador < 0) {
			contador = 0;
		}
		return pilha[contador];
	}
}