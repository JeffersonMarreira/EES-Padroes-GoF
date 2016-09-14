/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.trabalhopadroes7.observer;

/**
 *
 * @author Alcides e Camila
 */
public class Seguro implements Observador{

    @Override
    public void enviarAlerta(String ponto) {
        System.out.println("O Alarme do ponto " + ponto + " disparou. Acionar perícia da seguradora");
    }
    
}
