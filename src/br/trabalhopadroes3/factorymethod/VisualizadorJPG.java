
package br.trabalhopadroes3.factorymethod;


public class VisualizadorJPG extends Visualizador{

    @Override
    protected void criarImagem() {
        img = new ImagemJPG();
    }
    
}
