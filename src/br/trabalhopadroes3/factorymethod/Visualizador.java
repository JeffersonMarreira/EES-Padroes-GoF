package br.trabalhopadroes3.factorymethod;

public abstract class Visualizador {

    protected Imagem img;

    public Visualizador() {
        criarImagem();
        img.carregar();
        img.exibir();
        img.fechar();
    }
    
    protected abstract void criarImagem();

}
