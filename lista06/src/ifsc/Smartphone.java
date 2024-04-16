package ifsc;

public class Smartphone extends Produto{
	
	private String dimensoestela;
	private Integer versaodosistema;
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getVersaodosistema() {
		return versaodosistema;
	}

	public void setVersaodosistema(Integer versaodosistema) {
		this.versaodosistema = versaodosistema;
	}

	public String getDimensoestela() {
		return dimensoestela;
	}

	public void setDimensoestela(String dimensoestela) {
		this.dimensoestela = dimensoestela;
	} 
}