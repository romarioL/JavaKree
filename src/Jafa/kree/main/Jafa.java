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
	
	
	@SuppressWarnings("unused")
	public int viver(int vida) {		
			int vidaTotal = 1;
			int i = 1;
			while(i <= vida) {
				vidaTotal +=  i;
				i++;
			}
			
		   return vidaTotal;
	}

}
