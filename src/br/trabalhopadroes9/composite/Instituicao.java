package br.trabalhopadroes9.composite;

import java.util.ArrayList;
import java.util.List;

public class Instituicao extends Participante {

    List<Individuo> membros = new ArrayList<>();

    public Instituicao(String nome) {
        this.nome = nome;
    }

    public void adicionar(Participante participante) {
        membros.add((Individuo) participante);
    }

    public void remover(Participante participante) {
        membros.remove(participante);
    }

    public void imprimeMembros() {
        System.out.println("Instituição: " + this.getNome());
        System.out.println("Membros ---------------------------");
        for (Participante p : membros) {
            System.out.println("Nome: " + p.getNome());
            System.out.println("Assento: " + p.getAssento());
            System.out.println("---------------------------");
        }
    }

    @Override
    public String getAssento() {
        String assentos = "";
        for (Participante p : membros) {
            assentos = p.getAssento() + "\n";
        }
        return assentos;
    }

    @Override
    public void setAssento(String assento) {
        for (Participante p : membros) {
            p.setAssento(assento);
        }
    }

}
