package memento;

import java.util.ArrayList;
import java.util.List;

//Salva um hist�rico de estados da opera��o
public class OperacaoCareTaker {
	private List<OperacaoMemento> estados;
	
	public OperacaoCareTaker() {
		estados = new ArrayList<OperacaoMemento>();
	}
	
	//Adiciona um memento(estado da opera��o) no array de estados
	public void addMemento(OperacaoMemento memento) {
		estados.add(memento);
	}
	
	public String getEstadoAnterior() {
		if(estados.size() <= 0) {
			return "";
		}
		//Remove o �ltimo estado da lista
		estados.remove(estados.size() - 1);
		//Salva na vari�vel o �ltimo objeto memento da lista
		OperacaoMemento estadoSalvo = estados.get(estados.size() - 1);
		//Retorna a string do objeto
		return estadoSalvo.getOperacaoSalva();
	}
}
