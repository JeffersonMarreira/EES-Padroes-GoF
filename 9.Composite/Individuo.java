package br.trabalhopadroes9.composite;

public class Individuo extends Participante {

    private String assento;

    public Individuo(String nome) {
        this.nome = nome;
    }

    public String getAssento() {
        return assento;
    }

    @Override
    public void setAssento(String assento) {
        this.assento = assento;
    }

}
