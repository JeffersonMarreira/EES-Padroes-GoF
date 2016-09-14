
package br.trabalhopadroes8.templatemethod;

/**
 *
 */
public class TemplateMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringTemplate console;
        
       //Maiúsculo
        console = new StringMaiusculo();
        console.processar();
        
        //Minúsculo
        console = new StringMinusculo();
        console.processar();
        
        //Duplicar
        console = new StringDuplicate();
        console.processar();
        
        //Inverter
        console = new StringInverse();
        console.processar();
        
        
    }
    
}
