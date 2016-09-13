package decorator;

public class YogurtManga implements Yogurt {
	protected String nome;
	protected double preco;
	
	public YogurtManga() {
		nome = "Manga";
		preco = 1.50;
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public double getPreco() {
		return preco;
	}
}
