
public class Cliente {
	public static void main(String args[]) {

		Lista lista = new Lista();

		lista.adicionarItem("João");
		lista.adicionarItem("Silva");
		lista.adicionarItem("Morais");

		ListaAbstrata listaAbstrata = new ListaOrdenada(new ListaItensNumeros());
		listaAbstrata.imprimir(lista);

		System.out.println();

		ListaAbstrata listaAbstrata2 = new ListaOrdenada(new ListaItensMarcadores());
		listaAbstrata2.imprimir(lista);
	}
}