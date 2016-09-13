package templateMethod;

public abstract class LeitorTexto {
	protected String texto;
	
	public void atribuiTexto(String t) {
		setTexto(t);
		transformaTexto();
		imprimeTexto();
	}
	
	public void setTexto(String t) {
		this.texto = t;
	}
	
	public void imprimeTexto() {
		System.out.println(this.texto);
	}
	
	public abstract void transformaTexto();
}
