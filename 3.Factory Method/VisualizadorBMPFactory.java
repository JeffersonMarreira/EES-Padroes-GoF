package br.trabalhopadroes3.factorymethod;

public class VisualizadorBMPFactory extends Visualizador{

    @Override
    protected void criarImagem() {
        img = new ImagemBMP();
    }
    
}
