package templateMethod;

public class LeitorMaiusculo extends LeitorTexto {

	@Override
	public void transformaTexto() {
		texto = texto.toUpperCase() + "\n";		
	}
}
