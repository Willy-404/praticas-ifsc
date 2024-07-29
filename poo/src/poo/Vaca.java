package poo;

public class Vaca extends AbstractAnimal {
	public Vaca(){
		super("Vaca",4);
	}

	@Override
	public void emitirSom() {
		System.out.println("Meau meau");
	}
}
