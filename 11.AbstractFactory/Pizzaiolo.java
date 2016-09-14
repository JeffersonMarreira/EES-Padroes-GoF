
package br.trabalhopadroes11.abstractfactory;

public abstract class Pizzaiolo {

    Pizza pizza;

    public Pizzaiolo() {
        pizza = createPizza();
    }

    static Pizzaiolo criarPizzaiolo(int pizzaioloId) {
        switch (pizzaioloId) {
            case 1:
                return new Pizzaiolo1();
            case 2:
                return new Pizzaiolo2();
        }
        return null;
    }

    String getIngredientes() {
        return pizza.getIngredientes();
    }

    abstract Pizza createPizza();

}
