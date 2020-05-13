package Jafa.kree.main;

public class SystemLord {
	
	private String nome;
	
	private String rank;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRank() {
		return this.rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public String pedancy() {
		return "Kneel before your god!";
	}
	
	public String destroy(int numero) {
		if(numero >=5) {
			return numero * numero + " galaxies destroyed";
		}	
		return "I need more";
	}
	
	public String orders(Jafa j) {
		return "Take my orders, " + j.getNome();
	}
}
