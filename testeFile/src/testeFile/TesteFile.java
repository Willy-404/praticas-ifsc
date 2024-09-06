package testeFile;

import java.io.File;
import java.io.IOException;

public class TesteFile {

	public static void main(String[] args) {
		File f1 = new File("teste1.txt");
		try {
			if (!f1.exists()) {
				f1.createNewFile();
			} else if (f1.exists() && f1.isDirectory()) {
				System.out.println("objeto existe e é diretório");
			} else if (f1.exists() && f1.isFile()) {
				System.out.println("Objeto existe e é arquivo" + f1.getName());
			}
			
			File f2 = new File ("./");
			if (f2.exists() && f2.isDirectory()){
				File[] lista = f2.listFiles();
				for(File file: lista) {
					if (file.isDirectory()) {
						System.out.println("Diretorio "+file.getName());
					}else	{
						System.out.println("Arquivo "+file.getName());
					}
				}
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//System.out.println("Apagando Arquivo");
		//f1.delete();
		
		
	}
}	
	