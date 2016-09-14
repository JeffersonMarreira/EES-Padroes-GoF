
public class MontadorDirector {

    protected LancheBuilder montador;

    public MontadorDirector(LancheBuilder montador) {
        this.montador = montador;
    }

    public void montarItem() {
        montador.buildNome();
        montador.buildPreco();
        montador.buildDentroDaCaixa();
    }

    public ItemProduct getItem() {
        return montador.getItem();
    }
}
