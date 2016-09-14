package br.trabalhopadroes4.decorator;

public class SorveteCobertura extends SorveteDecorator {
    public double custo;
    public String produto;

    public SorveteCobertura(Sorveteria SorveteDecorator) {
        super(SorveteDecorator);
        this.custo = 15.00;
        this.produto = "cobertura";
    }
    @Override
    public double getCusto(){
        return super.getCusto()+ custo;
    }
    @Override
    public String getDescricao(){
        return super.getDescricao();
    }
    @Override
    public String getProdutos(){
        return super.getProdutos()+","+produto;
    }
    
}
