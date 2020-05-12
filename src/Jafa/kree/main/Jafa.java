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
			return "Marchamos  " + passos;
		}
		return "Você precisa marchar mais do que isso!";
	}
	
	public String viver(int vida) {
		
		if(vida >= 1500) {
			int vidaTotal = 0;
			for(int i = 0; i<= vida; i++) {
				vidaTotal += (i + 50);		
			}	
			return "Total de vida " + vidaTotal;	
		}
		return "Poucos dias de vida";
	}

}
