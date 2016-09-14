package br.trabalhopadroes1.singleton;

public class Logger {
	private boolean ativo = false;

	public Logger() {
	}

	public boolean isAtivo() {
		return this.ativo;
	}

	public void setAtivo(boolean b) {
		this.ativo = b;
	}

	public void log(String s) {
		if (this.ativo)
			System.out.println("LOG :: " + s);
	}
}