package br.padroes.adapter;

public class Main {	
	
	public static void main (String[] args){
		SomadorEsperado soma;
		Cliente cli = new Cliente(soma = new SomaAdapter());
		cli.executar();		
	}	
}
