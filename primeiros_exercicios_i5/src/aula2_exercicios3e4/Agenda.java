package aula2_exercicios3e4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Agenda {
	
	Scanner leitura = new Scanner(System.in);
	private List <Contatinho> contatinhos;
	
	//Construtor do ArrayList do Agenda;
	public Agenda() {
		this.contatinhos = new ArrayList<>();
	}
	
	//metodo adciona Contato;
	public void addContatinho(Contatinho contatinho){
		this.contatinhos.add(contatinho);
	}
	
	//metodo ordena pelo nome
	public void ordenarLista() {
		Collections.sort(contatinhos, Comparator.comparing(Contatinho::getNome));
	}
	
	//metodo para salvar lista em um arquivo
	public void salvarLista(String nomeArquivo) {
		ordenarLista();
		try	(BufferedWriter wr = new BufferedWriter(new FileWriter(nomeArquivo))){
			for (Contatinho contato : contatinhos) {
				wr.write(contato.toString());
				wr.newLine();
			}
		}catch(Exception e)	{
			System.out.println("Erro ao Salvar o Arquivo: "+ e.getMessage());
		}
	}
	
	public Contatinho lerContatinhoPorNome(String nome,String nomeArquivo) {
		try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))){
			String linha;
			while((linha = reader.readLine()) !=null) {
				String[] partes = linha.split("#");
				if(partes.length == 4 && partes[0].equalsIgnoreCase(nome))	{
					return	new Contatinho(partes[0],partes[1],partes[2],partes[3]);
				}
			}
			
		}	catch (IOException e)	{
			System.out.println("Erro ao ler arquivo!"+e.getMessage());
		}
		return null;
	}
}
