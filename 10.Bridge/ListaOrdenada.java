
import java.util.Collections;

public class ListaOrdenada extends ListaAbstrata {

	public ListaOrdenada(ListaImplementada listaImplementada) {
		super(listaImplementada);
	}

	public void imprimir(Lista lista) {
		this.imprimirLista(lista);	
	}
}