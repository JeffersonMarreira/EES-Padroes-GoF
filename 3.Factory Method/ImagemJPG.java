package br.trabalhopadroes3.factorymethod;

class ImagemJPG extends Imagem {

    @Override
    void carregar() {
        System.out.println("Imagem JPG:");
        System.out.println("Carregando imagem JPG...");

    }

}
