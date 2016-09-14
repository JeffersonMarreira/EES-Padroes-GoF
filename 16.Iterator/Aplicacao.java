
public class Aplicacao {
	
	private IteradorInterface itJogadorA;
    private IteradorInterface itJogadorB;
    private AgregadorDeCartas jogadorA;
    private AgregadorDeCartas jogadorB;
    private int rodada = 0;

	public static void main(String args[]) {
		
		jogadorA = new JogadorA();
        System.out.println("Jogador A");
        for (itJogadorA = jogadorA.criarIterador(); !itJogadorA
                .isDone(); itJogadorA.next()) {
            System.out.println(itJogadorA.currentItem().numero);
        }

        jogadorB = new JogadorB();
        System.out.println("\nJogador B");
        for (itJogadorB = jogadorB.criarIterador(); !itJogadorB
                .isDone(); itJogadorB.next()) {
            System.out.println(itJogadorB.currentItem().numero);
        }

        chamaNovaRodada();


	}

	private void chamaNovaRodada(){

        System.out.println("------------------------------------------------------");
        itJogadorA.first();
        itJogadorB.first();
        rodada++;
        System.out.println("Rodada " + rodada);
        System.out.println("Jogador A");
        System.out.println(itJogadorA.currentItem().numero);

        System.out.println("Jogador B");
        System.out.println(itJogadorB.currentItem().numero);

        if(itJogadorA.currentItem().numero < itJogadorB.currentItem().numero) {
            itJogadorA.colocarNoFinal(itJogadorB.currentItem());
            itJogadorA.colocarNoFinal(itJogadorA.currentItem());
            itJogadorB.remover(itJogadorB.currentItem());
        } else if(itJogadorB.currentItem().numero < itJogadorA.currentItem().numero){
            itJogadorB.colocarNoFinal(itJogadorA.currentItem());
            itJogadorB.colocarNoFinal(itJogadorB.currentItem());
            itJogadorA.remover(itJogadorA.currentItem());
        } else {
            itJogadorA.colocarNoFinal(itJogadorA.currentItem());
            itJogadorB.colocarNoFinal(itJogadorB.currentItem());
        }

        System.out.println("------------------------------------------------------");
      

        if(itJogadorA.estaVazia()){
            System.out.println("Fim do Jogo!");
            System.out.println("Jogador A Venceu o Jogo!");
        } else if(itJogadorB.estaVazia()){
            System.out.println("Fim do Jogo!");
            System.out.println("Jogador B Venceu o Jogo");
        } else {
            chamaNovaRodada();
        }

    }
}