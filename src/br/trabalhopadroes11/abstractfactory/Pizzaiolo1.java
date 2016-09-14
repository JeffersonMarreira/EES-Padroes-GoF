
package br.trabalhopadroes11.abstractfactory;

/**
 * Pizzaiolo1 - Segunda, Quarta, Sexta
 */
public class Pizzaiolo1 extends Pizzaiolo {

    @Override
    Pizza createPizza() {
        return new Calabresa();
    }

}
