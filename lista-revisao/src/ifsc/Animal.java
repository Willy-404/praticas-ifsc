package ifsc;

public abstract class Animal {
	private String Classe;
	private String NomeCientifico;
	
	
	public String getClasse() {
		return Classe;
	}
	public void setClasse(String classe) {
		Classe = classe;
	}
	public String getNomeCientifico() {
		return NomeCientifico;
	}
	public void setNomeCientifico(String nomeCientifico) {
		NomeCientifico = nomeCientifico;
	}
}
