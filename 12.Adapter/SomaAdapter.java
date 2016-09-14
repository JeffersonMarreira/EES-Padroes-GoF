package br.padroes.adapter;

import java.util.ArrayList;
import java.util.List;

public class SomaAdapter implements SomadorEsperado{
	private List<Integer> lista = new ArrayList<Integer>();
	@Override
	public int somaVetor(int[] vetor) {		
		for(int i = 0; i< vetor.length; i++){			
			lista.add(Integer.valueOf(vetor[i]));
		}
		SomadorExistente soma = new SomadorExistente();
		return soma.somaLista(lista);
	}
}
