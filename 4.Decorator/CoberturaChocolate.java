package decorator;

public class CoberturaChocolate extends YogurtDecorator {
	private String nome;
	private double preco;

	public CoberturaChocolate(Yogurt y) {
		super(y);
		nome = "Cobertura de Chocolate";
		preco = 0.50;
		System.out.println("-------------------------------");
		System.out.println("Adicionando cobertura de chocolate...");
	}
	
	public double getPreco() {
		return super.getPreco() + preco;
	}
	
	public String getNome() {
		return super.getNome() + " + " + nome;
	}
}
