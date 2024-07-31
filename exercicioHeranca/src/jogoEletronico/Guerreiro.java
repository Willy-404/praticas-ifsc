package jogoEletronico;

public class Guerreiro extends AbstractPersonagem{

	public Guerreiro(String nome) {
		super("Guerreiro");
	}

	@Override
	public void ataque() {
		System.out.println("Ataque Mordida no Joelho - 45 de dano");
	}

}
