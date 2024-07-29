package poo;

public class Main {

	public static void main(String[] args) {
		//Paciente p = new Paciente ("Renato","123,","1");
		AbstractPessoa p = new Paciente ("Renato","123","1");
		
		p.print();
		
		//Formas de Casting
		System.out.println(((Paciente)p).codigo);
		 
	}
}
