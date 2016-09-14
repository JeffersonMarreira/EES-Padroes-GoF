
package br.trabalhopadroes9.composite;

public class Composite {

    public static void main(String[] args) {
        Congresso c = new Congresso("Estudantil", 10);
        Individuo r = new Individuo("Roberto");
        Individuo l = new Individuo("Luíza");
        Individuo l2 = new Individuo("Paulo");
        c.adicionarParticipante(r);
        
        Instituicao emp = new Instituicao("petrobras");
        emp.adicionar(l);
        emp.adicionar(l2);
        emp.imprimeMembros();
        c.adicionarParticipante(emp);
        c.imprimeParticipantes();
    }

}
