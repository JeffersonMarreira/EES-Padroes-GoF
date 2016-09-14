package br.trabalhopadroes3.factorymethod;

class ImagemBMP extends Imagem {

    @Override
    void carregar() {
        System.out.println("Imagem BMP:");
        System.out.println("Carregando imagem BMP...");
    }
    
}
