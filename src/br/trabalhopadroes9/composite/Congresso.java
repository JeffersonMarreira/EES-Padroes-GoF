package br.trabalhopadroes9.composite;

import java.util.ArrayList;
import java.util.List;

public class Congresso {

    private String nome;
    private int totalAssentos;
    private List<Individuo> participantes = new ArrayList<>();

    public Congresso(String nome, int totalAssentos) {
        this.nome = nome;
        this.totalAssentos = totalAssentos;
    }

    /**
     * getTotalParticipantes Retorna o somatório do total de participantes
     *
     * @return int
     */
    public int getTotalParticipantes() {
        return participantes.size();
    }

    public void adicionarParticipante(Participante participante) {
        if (participante.getClass().equals(Individuo.class)) {
            inscrever((Individuo) participante);
        } else {
            for (Individuo i : ((Instituicao) participante).membros) {
                inscrever(i);
            }
        }
    }

    public void imprimeParticipantes() {
        System.out.println("Participantes inscritos---------------------------");
        for (Participante p : participantes) {
            System.out.println("Nome: " + p.getNome());
            System.out.println("Assento: " + p.getAssento());
            System.out.println("---------------------------");
        }
    }

    private void inscrever(Individuo i) {
        if (getTotalParticipantes() < totalAssentos) {
            i.setAssento("A" + (participantes.size() + 1));
            participantes.add(i);
        } else {
            System.out.println("Lotação atingida! Não é possível inscrever mais participantes");
        }
    }
}
