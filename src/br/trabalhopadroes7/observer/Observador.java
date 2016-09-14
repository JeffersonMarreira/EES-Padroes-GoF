package br.trabalhopadroes7.observer;

/**
 *  Interface que escuta os alarmes
 */
public interface Observador {
    void enviarAlerta(String ponto);    
}
