package poo;

public class Paciente extends AbstractPessoa {
	String codigo;
	//*************************************************************
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	//************************************************************
	
	public Paciente(String nome, String cpf, String codigo) {
		super(nome,cpf);
		this.nome = nome;
		this.codigo = codigo;
	}
	
	public void print() {
		System.out.println("====");
	}
	@Override
	public String toString() {
		String res = "Nome: "+ getNome();
		res+="\n";
		res+="CPF: "+getCPF();
		res+="\n";
		res+="Codigo: "+codigo;
		return res;
	}	
}
