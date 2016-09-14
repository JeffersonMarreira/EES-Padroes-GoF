
public class Cliente {
	public static void main(String args[]) {
		System.out.println('Abrindo jogo de futebol');
		Joystick joystickFutebol = new Joystick();
		joystickFutebol.executar(new ReceptorFutebol());

		System.out.println('Abrindo jogo de corrida');
		Joystick joystickCorrida = new Joystick();
		joystickCorrida.executar(new ReceptorCorrida());

		System.out.println('Abrindo jogo de luta');
		Joystick joystickLuta = new Joystick();
		joystickLuta.executar(new ReceptorLuta());
	}
}