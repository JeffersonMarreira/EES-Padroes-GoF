package br.trabalhopadroes7.observer;


/** 
 * *  Programa principal
 */
public class Observer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Delegacia d = new Delegacia();
        Seguro s = new Seguro();
        
        Alarme cozinha = new Alarme("cozinha");
        cozinha.adicionarObservador(d);
        cozinha.adicionarObservador(s);
        
        cozinha.dispararAlarme();
    }
    
}
