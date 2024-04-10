package ifsc;

import java.util.ArrayList;

public class MainVeiculo {

	public static void main(String[] args) {
		ArrayList<Veiculo> Veiculos = new ArrayList<>();

		Veiculo Kombi = new Veiculo();
		Kombi.setNome("Kombi");
		Kombi.setFabricante("VolksWagen");
		Kombi.setAno(1891);
		Kombi.setCor("Azul");
		Kombi.setNumeroderodas(4);
		Veiculos.add(Kombi);

		Veiculo Gol = new Veiculo();
		Gol.setNome("Gol");
		Gol.setFabricante("VolksWagen");
		Gol.setAno(2000);
		Gol.setCor("Preto");
		Gol.setNumeroderodas(20);
		Veiculos.add(Gol);

		Veiculo Corcel = new Veiculo();
		Corcel.setNome("Corcelao");
		Corcel.setFabricante("Ford");
		Corcel.setAno(1986);
		Corcel.setCor("Vermeio");
		Corcel.setNumeroderodas(4);
		Veiculos.add(Corcel);

		for (Veiculo veiculo : Veiculos) {
		   //objeto temp de escopo, Lista;
			System.out.println(veiculo.getNome());
			System.out.println(veiculo.getFabricante());
			System.out.println(veiculo.getAno());
			System.out.println(veiculo.getCor());
			System.out.println(veiculo.getNumeroderodas());
			System.out.println("");
		}
	}
}
