package jogoEletronico;

public class Mago extends AbstractPersonagem{

	public Mago(String nome) {
		super("Mago");
	}

	@Override
	public void ataque() {
		System.out.println("Ataque elédrigo - 54 de dano");
	}

}
