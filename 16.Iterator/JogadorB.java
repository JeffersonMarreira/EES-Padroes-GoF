
import java.util.Random;

public class JogadorB implements AgregadorDeCartas {

    protected Carta[] cartas;

    public JogadorB() {
        cartas = new Carta[20];
        for (int i=0;i<20;i++){
            cartas[i] = new Carta(new Random().nextInt(20) + 1);
        }
    }

    @Override
    public IteradorPilhaDeCartas criarIterador() {
        return new IteradorPilhaDeCartas(cartas);
    }
}
