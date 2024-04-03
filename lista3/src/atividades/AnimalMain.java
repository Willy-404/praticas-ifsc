package atividades;

public class AnimalMain {

	public static void main(String[] args) {
		Animal Cavalo = new Animal();
		Cavalo.nomesmaisusados = new String[5];
		Cavalo.nomecientifico = "Equus ferus";
		Cavalo.familia = "Equidae";
		Cavalo.reino = "Animalia";
		Cavalo.nomesmaisusados[0]="Vacalo";
		Cavalo.nomesmaisusados[1]="Coelho";
		Cavalo.nomesmaisusados[2]="Egua";
		Cavalo.nomesmaisusados[3]="Vaca";
		Cavalo.nomesmaisusados[4]="Pe de Pano";
		
		System.out.println("O nome cientifico do cavalo eh:"+Cavalo.nomecientifico);
		System.out.println("A familia do cavalo eh:"+Cavalo.familia);
		System.out.println("O reino do cavalo eh:"+Cavalo.reino);
		System.out.println("O 1 nome mais usado do cavalo eh:"+Cavalo.nomesmaisusados[0]);
		System.out.println("O 2 nome mais usado do cavalo eh:"+Cavalo.nomesmaisusados[1]);
		System.out.println("O 3 nome mais usado do cavalo eh:"+Cavalo.nomesmaisusados[2]);
		System.out.println("O 4 nome mais usado do cavalo eh:"+Cavalo.nomesmaisusados[3]);
		System.out.println("O 5 nome mais usado do cavalo eh:"+Cavalo.nomesmaisusados[4]);

	}
}
