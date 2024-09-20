package aula2_exercicios3e4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nomeArquivo = "contatinhos.txt";
		Agenda agenda = new Agenda();
		
		//declarando os contatos
		agenda.addContatinho(new Contatinho("Ana Silva","anaexemplo@gmail.com","123456","Mujer"));
		agenda.addContatinho(new Contatinho("Luiz","luiz@gmail.com","93213","Omen"));
		
		//Salvar contatos no Arquivo
		agenda.salvarLista(nomeArquivo);
		
		//Pede um nome para pesquisar
		Scanner leitura = new Scanner(System.in);
		System.out.print("Qual nome deseja buscar? ");
		String nome = leitura.nextLine();
		
		Contatinho contatinho = agenda.lerContatinhoPorNome(nome, nomeArquivo);
		//System.out.println(contatinho);
		
		if (contatinho != null){
		System.out.println("Contato encontrado");
		System.out.println("Nome: "+contatinho.getNome());
		System.out.println("E-Mail: "+contatinho.getEmail());
		System.out.println("Telefone: "+contatinho.getTelefone());
		System.out.println("Categoria: "+contatinho.getCategoria());
		}	else {
			System.out.println("Contato não encontrado");
		}
	}

}
