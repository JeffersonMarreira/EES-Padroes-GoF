package br.trabalhopadroes4.decorator;

public class SorveteDecorator implements Sorveteria {
    protected  Sorveteria SorveteDecorado;
    
        public SorveteDecorator(Sorveteria SorveteDecorator){
            this.SorveteDecorado = SorveteDecorator;
        }

    @Override
    public double getCusto() {
      return SorveteDecorado.getCusto();
    }

    @Override
    public String getDescricao() {
        return SorveteDecorado.getDescricao();
    }

    @Override
    public String getProdutos() {
       return SorveteDecorado.getProdutos();
    }
        
    
}
