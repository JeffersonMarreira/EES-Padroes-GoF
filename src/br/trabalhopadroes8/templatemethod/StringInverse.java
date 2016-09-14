
package br.trabalhopadroes8.templatemethod;

/**
 *
 */
public class StringInverse extends StringTemplate {

    @Override
    protected void transform() {
        StringBuilder sb = new StringBuilder(content);
        content = sb.reverse().toString();
    }

}
