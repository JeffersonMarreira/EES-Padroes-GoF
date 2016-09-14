
public abstract class AlunoColleague extends Colleague{
	protected Mediator mediator;

	public AlunoColleague(Mediator m) {
		super(m);
        mediator = m;
	}


	public void enviarTrabalho(String trabalho) {
		mediator.enviarTrabalhoParaProfessor(trabalho, this);
	}

	public void enviarMensagem(String mensagem, AlunoColleague alunoColleague) {
		mediator.enviarMensagem(mensagem, alunoColleague);
	}

	public abstract void receberMensagem(String trabalho);

}