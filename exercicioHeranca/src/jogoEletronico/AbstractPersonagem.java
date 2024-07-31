package jogoEletronico;

public abstract class AbstractPersonagem {
	
	String nome;
	public AbstractPersonagem(String nome) {
		this.nome = nome;
	}
	public abstract void ataque();
}
