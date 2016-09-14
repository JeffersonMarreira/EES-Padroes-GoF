
public abstract class ListaAbstrata {

	protected ListaImplementada listaImplementada;

	public ListaAbstrata(ListaImplementada listaImplementada) {
		this.listaImplementada = listaImplementada;
	}

	public void imprimirLista(Lista lista) {
		this.listaImplementada.imprimirLista(lista);
	}

	public abstract void imprimir(Lista lista);

}