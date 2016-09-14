package br.trabalhopadroes9.composite;

public abstract class Participante {

    protected String nome;

    public String getNome() {
        return nome;
    }

    public abstract String getAssento();

    public abstract void setAssento(String assento);

}
