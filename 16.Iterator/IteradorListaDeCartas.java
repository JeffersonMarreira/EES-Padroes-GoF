
import java.util.ArrayList;

public class IteradorListaDeCartas implements IteradorInterface{

	protected ArrayList<Carta> lista;
	protected int contador;

	protected IteradorListaDeCartas(ArrayList<Carta> lista) {
		this.lista = lista;
		contador = 0;
	}

	@Override
	public boolean estaVazia() {
		return lista.isEmpty();
	}

	@Override
	public void remover(Carta carta) {
		lista.remove(carta);
	}

	@Override
	public Carta proximo() {
		return lista.get(0);
	}

	/*@Override
	public void colocarNoFinal(ArrayList<Carta> cartas) {
		lista.removeAll(cartas);
		lista.addAll(cartas);
	}*/

	@Override
	public void colocarNoFinal(Carta carta) {
		lista.remove(carta);
		lista.add(carta);
	}

	@Override
	public void adicionar(Carta carta) {
		lista.add(carta);
	}

	@Override
	public void next() {
		contador++;
	}

	@Override
	public void first() {
		contador = 0;
	}

	@Override
	public boolean isDone() {
		return contador == lista.size();
	}

	@Override
	public Carta currentItem() {
		if (isDone()) {
			contador = lista.size() - 1;
		} else if (contador < 0) {
			contador = 0;
		}
		return lista.get(contador);
	}
}