package Jafa.kree.main;

public class Human {
	
	private String nome;
	private SGTeam team;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public SGTeam getTeam() {
		return this.team;
	}

	public void setTeam(SGTeam team) {
		this.team = team;
	}
	
	public String askForMission() {
		return "What's the mission, captain";
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
