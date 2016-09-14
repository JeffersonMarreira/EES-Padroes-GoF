
public abstract class Colleague {
	protected Mediator mediator;

	public Colleague(Mediator m) {
		mediator = m;
	}

	public abstract void receberTrabalho(String trabalho);

}