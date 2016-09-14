
package br.trabalhopadroes3.factorymethod;

public class Cliente {

    public static void main(String[] args) {
        Visualizador vBMP = new VisualizadorBMPFactory();
        Visualizador vJPG = new VisualizadorJPG();        
    }
    
}
