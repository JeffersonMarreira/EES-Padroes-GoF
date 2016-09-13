package decorator;

public class Aplicacao {

	public static void main(String[] args) {
		Yogurt yogurt = new YogurtManga();
		System.out.println(yogurt.getNome() + " = R$ " + yogurt.getPreco());
		
		yogurt = new TopoCastanha(yogurt);
		System.out.println(yogurt.getNome() + " = R$ " + yogurt.getPreco());
		
		yogurt = new CoberturaChocolate(yogurt);
		System.out.println(yogurt.getNome() + " = R$ " + yogurt.getPreco());
	}

}
