package br.trabalhopadroes4.decorator;

public class Main {
    public static void main(String args[]){
        Sorveteria sorveteria;
        sorveteria = new Sorvete();
        
        System.out.println("Produto:" + sorveteria.getProdutos());
        System.out.println("Preço:" + sorveteria.getCusto());
        
        sorveteria = new SorveteCobertura(sorveteria);
        sorveteria = new SorveteTopos(sorveteria);
        
        System.out.println("Produto:" + sorveteria.getProdutos());
        System.out.println("Preço:" + sorveteria.getCusto());
    }
}
