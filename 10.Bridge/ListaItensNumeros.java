
public class ListaItensNumeros implements ListaImplementada {

	public void imprimirLista(Lista lista) {
		int i = 1;
		for (String listaTmp : lista.getItens()) {
			System.out.println(i++ + " " + listaTmp);
		}
	}
}