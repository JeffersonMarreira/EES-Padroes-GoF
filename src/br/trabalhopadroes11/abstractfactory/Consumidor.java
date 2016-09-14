package br.trabalhopadroes11.abstractfactory;
import java.text.ParseException;


public class Consumidor {

    public static void main(String[] args) throws ParseException {

        String mensagem = Pizzaria.getIngredientes("28/12/2014");
        System.out.println("Os ingredientes são: " + mensagem);
    }

}
