package br.trabalhopadroes4.decorator;

public class Sorvete implements Sorveteria{
    private final double custo = 25.00;
    private final String descricao = "McColosso";
    private final String produto = "Super Mega Power Sorvete";

    @Override
    public double getCusto() {
        return custo;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String getProdutos() {
        return produto;
    }
    
}
