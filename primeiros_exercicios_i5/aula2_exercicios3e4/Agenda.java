package aula2_exercicios3e4;

import java.io.BufferedWriter;
import java.io.FileWriter;
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
}
