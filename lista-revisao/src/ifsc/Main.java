package ifsc;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Gato gato1 = new Gato();
		gato1.setClasse("Mamífero");
		gato1.setNomeCientifico("Felis catus domesticus");
		gato1.setApelido("GatoPerto");
		gato1.setPedigree("Próximo");
		
		Tutor tutor1 = new Tutor();
		tutor1.setNomeCompleto("HomiDoGatoPerto");
		tutor1.setGato(gato1);
		
		Gato gato2 = new Gato();
		gato2.setClasse("Mamífero");
		gato2.setNomeCientifico("Felis catus domesticus");
		gato2.setApelido("GatoLonge");
		gato2.setPedigree("Distante");
		
		Tutor tutor2 = new Tutor();
		tutor2.setNomeCompleto("HomiDoGatoLonge");
		tutor2.setGato(gato2);
		
		Gato gato3 = new Gato();
		gato3.setClasse("Mamífero");
		gato3.setNomeCientifico("Felis catus domesticus");
		gato3.setApelido("GatoLongo");
		gato3.setPedigree("Comprido");
		
		Tutor tutor3 = new Tutor();
		tutor3.setNomeCompleto("HomiDoGatoLongo");
		tutor3.setGato(gato3);
		
		ArrayList<Tutor> Tutores = new ArrayList<>();
		Tutores.add(tutor1);
		Tutores.add(tutor2);
		Tutores.add(tutor3);
		
		for (Tutor tutor : Tutores) {
			System.out.println(tutor.getNomeCompleto());
			System.out.println(tutor.getGato().getApelido());
			System.out.println(tutor.getGato().getNomeCientifico());
			System.out.println(tutor.getGato().getClasse());
			System.out.println(tutor.getGato().getPedigree());
			System.out.println("");
		}
	}
}
