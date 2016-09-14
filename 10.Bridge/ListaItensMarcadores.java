
public class ListaItensMarcadores implements ListaImplementada {

	public void imprimirLista(Lista lista) {
		for (String listaTmp : lista.getItens()) {
			System.out.println(" - " + listaTmp);
		}
	}
}