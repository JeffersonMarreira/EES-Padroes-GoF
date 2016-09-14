
package br.trabalhopadroes8.templatemethod;

/**
 *
 */
public class StringDuplicate extends StringTemplate {

    @Override
    protected void transform() {
        content += content;
    }

}
