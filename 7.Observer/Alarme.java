package br.trabalhopadroes7.observer;

import java.util.ArrayList;
import java.util.List;

public class Alarme {

    String ponto = "";

    private final List<Observador> obs = new ArrayList<>();

    public Alarme(String ponto) {
        this.ponto = ponto;
    }

    public void dispararAlarme() {
        System.out.println("O Alarme do ponto " + ponto + " disparou!");
        notificar();
    }

    private void notificar() {
        for (Observador o : obs) {
            o.enviarAlerta(ponto);
        }
    }

    public void adicionarObservador(Observador o) {
        obs.add(o);
    }
}
