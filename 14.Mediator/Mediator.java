
public interface Mediator {

	void enviarTrabalhoParaProfessor(String trabalho, Colleague colleague);

	void enviarTrabalhoParaAlunos(String trabalho, Colleague colleague);

	void enviarMensagem(String mensagem, AlunoColleague receptor);

}