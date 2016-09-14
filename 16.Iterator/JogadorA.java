
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Igor on 20/08/2016.
 */
public class JogadorA implements AgregadorDeCartas {

    protected ArrayList<Carta> cartas;

    public JogadorA() {
        cartas = new ArrayList<Carta>();
        for (int i=0;i<20;i++){
            cartas.add(new Carta(new Random().nextInt(20) + 1));
        }
    }

    @Override
    public IteradorListaDeCartas criarIterador() {
        return new IteradorListaDeCartas(cartas);
    }
}
