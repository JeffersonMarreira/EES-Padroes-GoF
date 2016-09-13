package templateMethod;

public class LeitorDuplicador extends LeitorTexto {

	@Override
	public void transformaTexto() {
		texto += " " + texto +  "\n";		
	}
}
