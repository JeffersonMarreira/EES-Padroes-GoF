
public class AlunoAColleague extends AlunoColleague {

	public AlunoAColleague(Mediator m) {
		super(m);
	}

	@Override
	public void receberTrabalho(String trabalho) {
		System.out.println("AlunoA recebeu trabalho: " + trabalho);
	}

	@Override
	public void receberMensagem(String mensagem) {

		System.out.println("AlunoA recebeu mensagem: " + mensagem);

	}


}