
public class Aplicacao {

	public static void main(String args[]) {
		
	  	ComunicacaoMediator mediador = new ComunicacaoMediator();

        ProfessorColleague professor = new ProfessorColleague(mediador);
        AlunoAColleague alunoA = new AlunoAColleague(mediador);
        AlunoBColleague alunoB = new AlunoBColleague(mediador);

        mediador.adicionarColleague(professor);
        mediador.adicionarColleague(alunoA);
        mediador.adicionarColleague(alunoB);

        professor.enviarTrabalho("Trabalho do professor");
        System.out.println("=========");
        alunoA.enviarTrabalho("Trabalho do alunoA");
        System.out.println("=========");
        alunoA.enviarTrabalho("Trabalho do alunoB");
        System.out.println("=========");
        System.out.println("=========");

        System.out.println("=========");
        alunoA.enviarMensagem("Mensagem do aluno A", alunoB);
        alunoB.enviarMensagem("Mensagem do aluno B", alunoA);
        System.out.println("=========");


	}

}