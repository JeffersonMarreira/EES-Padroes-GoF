package memento;

import java.util.ArrayList;
import java.util.List;

//Salva um histórico de estados da operação
public class OperacaoCareTaker {
	private List<OperacaoMemento> estados;
	
	public OperacaoCareTaker() {
		estados = new ArrayList<OperacaoMemento>();
	}
	
	//Adiciona um memento(estado da operação) no array de estados
	public void addMemento(OperacaoMemento memento) {
		estados.add(memento);
	}
	
	public String getEstadoAnterior() {
		if(estados.size() <= 0) {
			return "";
		}
		//Remove o último estado da lista
		estados.remove(estados.size() - 1);
		//Salva na variável o último objeto memento da lista
		OperacaoMemento estadoSalvo = estados.get(estados.size() - 1);
		//Retorna a string do objeto
		return estadoSalvo.getOperacaoSalva();
	}
}
