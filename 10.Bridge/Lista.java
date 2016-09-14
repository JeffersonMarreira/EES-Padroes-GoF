
import java.util.ArrayList;
import java.util.Collections;

public class Lista {

	protected ArrayList<String> itens;

	public Lista() {
		this.itens = new ArrayList<String>();
	}

	public ArrayList<String> getItens() {
		return this.itens;
	}

	public void adicionarItem(String item) {
		this.itens.add(item);
	}



}