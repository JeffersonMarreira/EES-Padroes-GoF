
package br.trabalhopadroes8.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 */
public abstract class StringTemplate {

    String content;

    protected abstract void transform();

    protected void imprimir() {
        System.out.println(this.getClass()+"\n"+content);
    }

    protected void lerString() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Digite uma palavra: ");
            content = br.readLine();
        } catch (IOException io) {
            System.err.println(io.toString());
        }
    }

    public void processar() {
        lerString();
        transform();
        imprimir();
    }
}
