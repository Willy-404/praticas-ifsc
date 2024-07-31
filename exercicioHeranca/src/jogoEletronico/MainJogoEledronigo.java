package jogoEletronico;

public class MainJogoEledronigo {

	public static void main(String[] args) {
		AbstractPersonagem guerreiro1 = new Guerreiro("He-Man");
		AbstractPersonagem arqueiro1 = new Arqueiro ("Robin Udis");
		AbstractPersonagem mago1 = new Mago ("Mestre dos magos");
		
		arqueiro1.ataque();
		mago1.ataque();
		guerreiro1.ataque();
	}
}
