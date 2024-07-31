
package saude;

public class MainSaude {

	public static void main(String[] args) {
		AbstractPaciente HomiRespirador = new Respiratoria();
		AbstractPaciente HomiCardiaco = new Cardiovascular();
		AbstractPaciente GuriaDiabetica = new Diabetes();
		
		HomiRespirador.tratamento();
		HomiCardiaco.tratamento();
		GuriaDiabetica.tratamento();
	}
}
