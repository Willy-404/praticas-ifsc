package atividades;


public class PessoaMainA {

	public static void main(String[] args) {
		Pessoa Francisco = new Pessoa();
		
		Francisco.nome = "Francisco";
		Francisco.cpf = (long) 111222333;
		Francisco.datadenascimento = "1953";
		
		System.out.println(Francisco.nome);
		System.out.println(Francisco.cpf);
		System.out.println(Francisco.datadenascimento);
		System.out.println("");
		
		Pessoa Valdir = new Pessoa();
		
		Valdir.nome = "Valdir";
		Valdir.cpf = (long) 222111333;
		Valdir.datadenascimento = "1961";
		
		System.out.println(Valdir.nome);
		System.out.println(Valdir.cpf);
		System.out.println(Valdir.datadenascimento);
		System.out.println("");
		
		Pessoa Evandro = new Pessoa();
		
		Evandro.nome = "Evandro";
		Evandro.cpf = (long) 333222111;
		Evandro.datadenascimento = "1981";
		
		System.out.println(Evandro.nome);
		System.out.println(Evandro.cpf);
		System.out.println(Evandro.datadenascimento);
	}
}
