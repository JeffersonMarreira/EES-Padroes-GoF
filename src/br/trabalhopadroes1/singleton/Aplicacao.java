package br.trabalhopadroes1.singleton;

public class Aplicacao {
	public static void main(String[] args) {		
		Logger log1 = LoggerSingleton.getInstancia();		
		log1.setAtivo(true);		
		log1.log("PRIMEIRA MENSAGEM DE LOG");	
		Logger log2 = LoggerSingleton.getInstancia();		
		log2.log("SEGUNDA MENSAGEM DE LOG");		
	}
}