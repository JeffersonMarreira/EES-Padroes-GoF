package decorator;

public class YogurtDecorator implements Yogurt {
	private Yogurt yogurt;
	
	//Instancia o decorador e define o yogurt que vai ser decorado
	public YogurtDecorator(Yogurt y) {
		this.yogurt = y;
	}
	
	@Override
	public String getNome() {
		return yogurt.getNome();
	}
	
	@Override
	public double getPreco() {
		return yogurt.getPreco();
	}
}
