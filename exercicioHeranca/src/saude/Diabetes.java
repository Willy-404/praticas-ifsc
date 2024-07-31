package saude;

public class Diabetes extends AbstractPaciente{

	@Override
	public void tratamento() {
		System.out.println("Tomar injeção de Insulina");
	}
}
