
public class ProfessorColleague extends Colleague {

	public ProfessorColleague(Mediator m) {
		super(m);
	}

	@Override
	public void receberTrabalho(String trabalho) {
		System.out.println("Professor recebeu trabalho: " + trabalho);
	}

	public void enviarTrabalho(String trabalho) {
		mediator.enviarTrabalhoParaAlunos(trabalho, this);
	}

}