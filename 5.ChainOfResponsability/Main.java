package br.trabalhopadroes5.chainofresponsability;

public class Main {
    public static void main(String args[]){
        MaquinaVendaChain maquinas = new Slot1();
        maquinas.setNext(new Slot2());
        maquinas.setNext(new Slot3());
        
        try {
        	maquinas.efetuarPagamento(IDSlots.slot3, 0.10);
            maquinas.efetuarPagamento(IDSlots.slot3, 0.10);
            maquinas.efetuarPagamento(IDSlots.slot3, 0.10);
            maquinas.efetuarPagamento(IDSlots.slot3, 0.10);
            maquinas.efetuarPagamento(IDSlots.slot3, 0.10);
            maquinas.efetuarPagamento(IDSlots.slot3, 0.10);
            maquinas.efetuarPagamento(IDSlots.slot3, 0.10);
            maquinas.efetuarPagamento(IDSlots.slot3, 0.10);
            maquinas.efetuarPagamento(IDSlots.slot2, 0.05);
            maquinas.efetuarPagamento(IDSlots.slot2, 0.05);
            maquinas.efetuarPagamento(IDSlots.slot2, 0.05);
            maquinas.efetuarPagamento(IDSlots.slot2, 0.05);
            maquinas.efetuarPagamento(IDSlots.slot2, 0.05);
            maquinas.efetuarPagamento(IDSlots.slot1, 0.01);
            maquinas.efetuarPagamento(IDSlots.slot1, 0.01);
            maquinas.efetuarPagamento(IDSlots.slot1, 0.01);
            maquinas.efetuarPagamento(IDSlots.slot1, 0.01);
            maquinas.efetuarPagamento(IDSlots.slot1, 0.01);
            maquinas.comprarProduto(IDProdutos.Refrigerante);
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
