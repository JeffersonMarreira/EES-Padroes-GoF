
import java.util.ArrayList;

public interface IteradorInterface {

    Carta proximo();
    void remover(Carta carta);
    void adicionar(Carta carta);
    boolean estaVazia();

    void next();

    boolean isDone();

    Carta currentItem();

    void first();

    void colocarNoFinal(Carta carta);




}