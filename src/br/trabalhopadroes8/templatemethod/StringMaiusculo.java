
package br.trabalhopadroes8.templatemethod;

/**
 *
 */
public class StringMaiusculo extends StringTemplate{

    @Override
    protected void transform() {
        content = content.toUpperCase();
    }
    
}
