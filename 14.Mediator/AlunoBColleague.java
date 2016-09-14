
public class AlunoBColleague extends AlunoColleague {

	public AlunoBColleague(Mediator m) {
		super(m);
	}

	@Override
	public void receberTrabalho(String trabalho) {
		System.out.println("AlunoB recebeu trabalho: " + trabalho);
	}

	@Override
	public void receberMensagem(String mensagem) {

		System.out.println("AlunoB recebeu mensagem: " + mensagem);

	}


}