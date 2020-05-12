package Jafa.kree.main;

public class Jafa {
	
	private String nome;
	
	private String systemLord;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSystemLord() {
		return systemLord;
	}
	public void setSystemLord(String systemLord) {
		this.systemLord = systemLord;
	}
	
	public String saudar() {
		return "Jafa, Kree!";
	}
	
	public String marchar(int passos) {
		if(passos >= 5) {
			int totalPassos = 1;
			for(int i = 1; i<=passos;i++) {
				totalPassos +=  i;
			}
			return "Marchamos  " + totalPassos;
		}
		return "Você precisa marchar mais do que isso!";
	}
	
	public String viver(int vida) {		
		if(vida >= 1500) {
			int vidaTotal = 1;
			for(int i = 1; i<= vida; i++) {
				vidaTotal +=  i;	
			}	
			return "Total de vida " + vidaTotal;	
		}
		return "Poucos dias de vida";
	}

}
