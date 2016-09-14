//Questão 1

package br.trabalhopadroes1.singleton;

public class LoggerSingleton {
    
    public static Logger instancia;
    
    protected LoggerSingleton(){
    }
    
    public static Logger getInstancia()
    {
        if(instancia == null)
            instancia = new Logger();
        return instancia;
    }
}
