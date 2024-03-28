package osmeninotacopacote;

public class Main {
	public static void main(String[] args) {
		Pessoa Feliep = new Pessoa ();
		Pessoa Larica = new Pessoa ();

		Pessoa Willy = new Pessoa ();		
		Willy.cpf = "123456";
		Willy.primeironome = "Willian";
		Willy.sobrenome = "dos Anjos";
		
		System.out.println(Willy.cpf);
		System.out.println(Willy.primeironome);
		System.out.println(Willy.sobrenome);

	}
}
