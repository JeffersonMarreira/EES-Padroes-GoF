package br.trabalhopadroes2.strategy;

public class LoggerEventView {
	public static final int  BANCODEDADOS = 1;
	public static final int  ARQUIVO = 2;	
	protected LoggerStrategy estrategiaLog;
	protected int modoGravacao;
	protected String dadosLog;

	public LoggerEventView(int modo, String dadosLog) {
		this.dadosLog = dadosLog;
		
		switch (modo){
		case BANCODEDADOS:
			estrategiaLog = new LoggerDatabase();
			modoGravacao = BANCODEDADOS;
			break;
		case ARQUIVO:
			estrategiaLog = new LoggerFile();
			modoGravacao = ARQUIVO;
			break;
			
		default:
			throw new RuntimeException("Modo de gravacao nao encontrado!\n");		
		}		
	}

	public String registraLog (){
		return estrategiaLog.registraLog(this);
	}
	
	public String getDadosLog() {
		return dadosLog;
	}

}