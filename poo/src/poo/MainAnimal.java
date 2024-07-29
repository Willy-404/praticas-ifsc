package poo;

public class MainAnimal {

	public static void main(String[] args) {
		AbstractAnimal vaca = new Vaca();
		AbstractAnimal ovelha = new Ovelha();
		
		vaca.emitirSom();
		ovelha.emitirSom();
	}
}
