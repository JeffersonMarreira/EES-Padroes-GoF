package br.trabalhopadroes3.factorymethod;

public abstract class Imagem {

    abstract void carregar();

    public void exibir() {
        System.out.println("Exibindo imagem por 20 segundos");
    }

    public void fechar() {
        System.out.println("Fechando imagem");
    }

}
