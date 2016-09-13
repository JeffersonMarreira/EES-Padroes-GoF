package templateMethod;

public class LeitorInverso extends LeitorTexto {

	@Override
	public void transformaTexto() {
		texto = new StringBuilder(texto).reverse().toString();		
	}
}
