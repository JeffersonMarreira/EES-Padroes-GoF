
package br.trabalhopadroes8.templatemethod;

/**
 *
 */
public class StringMinusculo extends StringTemplate {

    @Override
    protected void transform() {
        content = content.toLowerCase();
    }

}
