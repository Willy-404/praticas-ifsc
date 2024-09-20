package aula2_exercicios1e2;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) throws IOException {
		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite um numero de 1 a 10 para a leitura da Tabuada");
		int numero = leitura.nextInt();
		
		String nomeDoArquivo = ("tabuadaDo"+numero+".txt");
		File arquivoLeitura = new File (nomeDoArquivo);
		if (!arquivoLeitura.exists()) {
			System.out.println("Arquivo nao existe!");
		}else {
		
		String caminhoDoArquivo = "C:\\Users\\Aluno\\Downloads\\praticas-ifsc-main\\"
				+ "primeiros_exercicios_i5\\"+nomeDoArquivo;
		try {
			@SuppressWarnings("resource")
			BufferedReader leitor = 
					new BufferedReader(new FileReader(caminhoDoArquivo));
			System.out.println("A tabuada do "+numero+":");
			String linha = "";
			while((linha = leitor.readLine()) != null) {
				System.out.println(linha);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		}
		
	}
}
