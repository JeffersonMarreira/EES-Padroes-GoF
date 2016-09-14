
import java.util.ArrayList;

public class ComunicacaoMediator implements Mediator {

	protected ArrayList<Colleague> contatos;

	public ComunicacaoMediator() {
		contatos = new ArrayList<Colleague>();
	}

	public void adicionarColleague(Colleague colleague) {
		contatos.add(colleague);
	}

	@Override
	public void enviarTrabalhoParaAlunos(String trabalho, Colleague colleague) {
		for (Colleague contato : contatos) {
			if (contato != colleague) {
				definirProtocolo(contato);
				contato.receberTrabalho(trabalho);
			}
		}
	}

	@Override
	public void enviarTrabalhoParaProfessor(String trabalho, Colleague colleague) {
		for (Colleague contato : contatos) {
			if (contato != colleague && contato instanceof ProfessorColleague) {
				definirProtocolo(contato);
				contato.receberTrabalho(trabalho);
			}
		}
	}

	@Override
	public void enviarMensagem(String mensagem, AlunoColleague receptor) {
		definirProtocolo(receptor);
		receptor.receberMensagem(mensagem);
	}

	private void definirProtocolo(Colleague contato) {
		if (contato instanceof ProfessorColleague) {
			System.out.println("Protocolo PROFESSOR");
		} else if (contato instanceof AlunoAColleague) {
			System.out.println("Protocolo Aluno A");
		} else if (contato instanceof AlunoBColleague) {
			System.out.println("Protocolo Aluno B");
		}
	}

}