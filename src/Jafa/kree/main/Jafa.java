package Jafa.kree.main;

public class Jafa {
	
	private String nome;
	
	private SystemLord systemLord;
	
	public Jafa(String nome, SystemLord systemLord) {
		this.nome = nome;
		this.systemLord = systemLord;
	}
	
	public Jafa() {
		
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public SystemLord getSystemLord() {
		return this.systemLord;
	}
	public void setSystemLord(SystemLord systemLord) {
		this.systemLord = systemLord;
	}
	
	public String saudar() {
		return "Jafa, Kree!";
	}
	
	
	public int viver(int vida) {		
		if(vida >= 1500) {
			int vidaTotal = 1;
			for(int i = 1; i<= vida; i++) {
				vidaTotal +=  i;	
			}	
			return vidaTotal;	
		}
		return 0;
	}

}
