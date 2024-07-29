package poo;

public class Ovelha extends AbstractAnimal{
	public Ovelha() {
		super("Ovelha",4);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Au au");
	}
}
