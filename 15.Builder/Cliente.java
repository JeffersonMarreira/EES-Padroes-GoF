
public class Cliente {

	public static void main(String args[]) {

    	Atendente atendente = new Atendente();
	    atendente.adicionarPedido(new HanburguerBuilder());
	    atendente.adicionarPedido(new BatataGrandeBuilder());
	    atendente.adicionarPedido(new CarrinhoBuilder());
	    atendente.adicionarPedido(new CocaBuilder());

	    atendente.imprimirPedido();

	}
}
