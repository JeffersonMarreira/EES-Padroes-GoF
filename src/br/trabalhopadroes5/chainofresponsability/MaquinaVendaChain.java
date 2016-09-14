package br.trabalhopadroes5.chainofresponsability;

import java.math.BigDecimal;

public abstract class MaquinaVendaChain {
    protected MaquinaVendaChain next;
    protected IDSlots identificadorSlot;
    protected IDProdutos identificadorProduto;
    public static double valorTotal;

        
    public MaquinaVendaChain(IDSlots id){
        next = null;
        identificadorSlot = id;
    }
    
    	    
    protected abstract void receberMoedas(double valor);
    
    
    
    
    public void comprarProduto(IDProdutos id){
    	String mensItemComprado = " comprado! Abra a gaveta e retire o produto!";
    	String mensValorItem = "Valor: R$";
    	String mensTroco = "Seu troco e R$";
    	String mensSemProd = "Produto nao encontrado";

    	
    	switch(id){
    	case Refrigerante:
    		if(valorTotal >= Double.parseDouble("1.00")){    			
    			valorTotal = new BigDecimal(Double.toString(valorTotal+0.001).substring(0,4)).subtract(new BigDecimal("1.00")).doubleValue();    		
	    		System.out.println(id.name()+ mensItemComprado);
	    		System.out.println(mensValorItem+ Double.parseDouble("1.00") );
	    		if(!BigDecimal.valueOf(Double.parseDouble((Double.toString(valorTotal)))).equals(Double.parseDouble("0.00"))){
	    			System.out.println(mensTroco+Double.toString(valorTotal));    			
	    		}
    		}
    		break;
    	case Salgadinho:
    		if(valorTotal >= Double.parseDouble("1.50")){
	    		valorTotal -= Double.parseDouble("1.50");
	    		System.out.println(id.name()+ mensItemComprado);
	    		System.out.println(mensValorItem+ Double.parseDouble("1.50") );
	    		if(!Double.valueOf(valorTotal).equals(Double.parseDouble("0.00"))){
	    			System.out.println(mensTroco+Double.toString(valorTotal));    			
	    		}
    		}
    		break;
    	case Chips:
    		if(valorTotal >= Double.parseDouble("2.00")){
    		valorTotal -= Double.parseDouble("2.00");
    		System.out.println(id.name()+ mensItemComprado);
    		System.out.println(mensValorItem+ Double.parseDouble("2.00") );
    		if(!Double.valueOf(valorTotal).equals(Double.parseDouble("0.00"))){
    			System.out.println(mensTroco+Double.toString(valorTotal));    			
    		}
    		}
    		break;
    	
    	}
    	
    }
    
    
    public void setNext(MaquinaVendaChain pagamento)
    {
        if(next == null)
        {
            next = pagamento;
        }
        else
        {
            next.setNext(pagamento);
        }
    }
    
    
      
	public void efetuarPagamento(IDSlots id, double moedas) throws Exception
    {
       if(podeReceberMoedas(id))
       {
           receberMoedas(moedas);           
       }
       else{
          if(next == null)
          {
        	  throw new Exception("Moedas não cadastradas");
          } 
          next.efetuarPagamento(id, moedas);
       }
    }
    
	
	
    private boolean podeReceberMoedas(IDSlots id) {
       if (identificadorSlot == id){
    	   return true;
       }
       return false;
    	   
    }
    
}