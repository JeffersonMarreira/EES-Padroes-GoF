package br.trabalhopadroes7.observer;

public class Delegacia implements Observador {

    @Override
    public void enviarAlerta(String ponto) {
        System.out.println("O Alarme do ponto " + ponto + " disparou. Enviar viaturas");
    }

}
