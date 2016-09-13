package memento;

//import java.util.ArrayList;
//import java.util.List;

//Classe que guarda o estado de uma opera��o
public class OperacaoMemento {
	//private List<String> estadoOperacao = new ArrayList<String>();
	private String estadoOperacao;
	
	//Salva um estado de uma opera��o
//	public OperacaoMemento(List<String> elementosOperacao) {
//		this.estadoOperacao = elementosOperacao;
//	}
	public OperacaoMemento(String elementosOperacao) {
		this.estadoOperacao = elementosOperacao;
	}
	
	public String getOperacaoSalva() {
		return this.estadoOperacao;
	}
}