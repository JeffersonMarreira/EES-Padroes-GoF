package br.trabalhopadroes4.decorator;

public class SorveteTopos extends SorveteDecorator {
    public double custo;
    public String produto;
        
    public SorveteTopos(Sorveteria SorveteDecorator){
        super(SorveteDecorator);
        this.custo = 10.00;
        this.produto = "topo";
    }

    @Override
    public double getCusto() {
       return super.getCusto() + custo;
    }

    @Override
    public String getDescricao() {
      return super.getDescricao();
    }

    @Override
    public String getProdutos() {
       return super.getProdutos()+""+produto;
    }
}
