package exerciciosAula2;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) throws IOException {
		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite um numero de 1 a 10 para a Tabuada");
		int numero = leitura.nextInt();
		
		String nomeDoArquivo = "tabuadaDo"+ numero + ".txt";
		File tabuada = new File(nomeDoArquivo);
		if (!tabuada.exists())	{
		tabuada.createNewFile();
		}
		
		try (BufferedWriter escrita =
				new BufferedWriter(
						new FileWriter(nomeDoArquivo)))	{
			for (int i = 1; i <=10; i++) {
				escrita.write(numero + "x" + i + "=" + (numero +1));
				escrita.newLine();
			}
			System.out.println("Tabuada Salva no Arquivo: "+ nomeDoArquivo);
		} catch (IOException e)	{
			System.out.println("Erro ao escrever no Arquivo: "+ e.getMessage());
		}	finally {
			leitura.close();
		}
		
	}

}
