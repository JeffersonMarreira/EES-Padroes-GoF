package br.trabalhopadroes2.strategy;

public class Aplicacao {
	public static void main(String[] args) {
		LoggerEventView log1 = new LoggerEventView(LoggerEventView.BANCODEDADOS, "PRIMEIRA MENSAGEM DE LOG");
		System.out.println(log1.registraLog());
		
		LoggerEventView log2 = new LoggerEventView(LoggerEventView.ARQUIVO, "SEGUNDA MENSAGEM DE LOG");
		System.out.println(log2.registraLog());
	}
}