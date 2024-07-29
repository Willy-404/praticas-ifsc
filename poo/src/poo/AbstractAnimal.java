package poo;

public abstract class AbstractAnimal {
	String nome;
	int patas;
	public AbstractAnimal (String nome, int patas) {
		this.nome = nome;
		this.patas = patas;
	}
	public abstract void emitirSom();
}
