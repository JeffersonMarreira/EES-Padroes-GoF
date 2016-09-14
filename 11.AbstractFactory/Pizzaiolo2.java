
package br.trabalhopadroes11.abstractfactory;

/**
 * Pizzaiolo 2 - Terça, Quinta, Sábado
 */
class Pizzaiolo2 extends Pizzaiolo {

    @Override
    Pizza createPizza() {
        return new Presunto();
    }

}
