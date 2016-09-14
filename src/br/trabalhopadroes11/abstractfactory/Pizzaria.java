
package br.trabalhopadroes11.abstractfactory;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Pizzaria {

    static Pizzaiolo pizzaiolo;

    public static String getIngredientes(String data) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date ontem = sdf.parse(data);   //dd/MM/yyyy
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(ontem);
        int diaDaSemana = gc.get(GregorianCalendar.DAY_OF_WEEK);

        switch (diaDaSemana) {
            //Domingo
            case 1:
                return "Aos domingos a pizzaria está fechada";
            //Segunda,Quarta,Sexta
            case 2:
            case 4:
            case 6:
                pizzaiolo = Pizzaiolo.criarPizzaiolo(1);
                break;
            //Terça,Quinta,Sábado
            case 3:
            case 5:
            case 7:
                pizzaiolo = Pizzaiolo.criarPizzaiolo(2);
                break;

        }

        return pizzaiolo.getIngredientes();
    }

}
