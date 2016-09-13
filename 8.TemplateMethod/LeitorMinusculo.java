package templateMethod;

public class LeitorMinusculo extends LeitorTexto {

	@Override
	public void transformaTexto() {
		texto = texto.toLowerCase() + "\n";		
	}
}
