package decorator;

public class TopoCastanha extends YogurtDecorator {
	private String nome;
	private double preco;

	public TopoCastanha(Yogurt y) {
		super(y);
		this.nome = "Topo de Castanha";
		this.preco = 1.00;
		System.out.println("-------------------------------");
		System.out.println("Adicionando topo de castanha...");
	}
	
	public double getPreco() {
		return super.getPreco() + preco;
	}
	
	public String getNome() {
		return super.getNome() + " + " + nome;
	}
}
