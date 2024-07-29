package poo;

public abstract class AbstractPessoa {
	private String nome;
	String CPF;
	Endereco endereco;
	public AbstractPessoa (String nome, String CPF) {
		this.nome=nome;
		this.CPF=CPF;
	}
	public void print() {
		
	}
	
	//************************************************************
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	//************************************************************
	
}
