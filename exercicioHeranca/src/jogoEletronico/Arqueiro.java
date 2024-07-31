package jogoEletronico;

public class Arqueiro extends AbstractPersonagem{
	public Arqueiro(String nome) {
		super ("Arqueiro");
	}

	@Override
	public void ataque() {
		System.out.println("Frechada - 69 de Dano");
	}
}
