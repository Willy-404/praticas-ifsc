package aula2_exercicios3e4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nomeArquivo = "contatinhos.txt";
		Agenda agenda = new Agenda();
		
		agenda.addContatinho(new Contatinho("Ana Sivla","anaexemplo@gmail.com","123456","Mujer"));
		agenda.addContatinho(new Contatinho("Luiz","luiz@gmail.com","93213","Omen"));
		
		agenda.salvarLista(nomeArquivo);
	}

}
