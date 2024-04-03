package atividades;

import java.util.Scanner;

public class PessoaMainB {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int i=0;
		Pessoa[] pessoas = new Pessoa[3];
		for (i=0;i<pessoas.length;i++) {
			Pessoa p1 = new Pessoa();
			p1.nome = leitura.nextLine();
			String a = leitura.nextLine();
			p1.cpf = Long.valueOf(a);
			p1.datadenascimento = leitura.nextLine();
			pessoas[i]=p1;
		}
		
		for (i=0;i<pessoas.length;i++) {
			System.out.println("O nome da pessoa "+i);
			System.out.println(pessoas[i].nome);
			System.out.println("O cpf eh");
			System.out.println(pessoas[i].cpf);
			System.out.println("A data de nascimento eh");
			System.out.println(pessoas[i].datadenascimento);
		}
	}
}
