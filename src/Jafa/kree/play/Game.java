package Jafa.kree.play;

import Jafa.kree.main.Mothership;

public class Game {
	
	private Jafa.kree.main.SGTeam SGTeam;
	private Mothership mothership;
	
	public Game(Jafa.kree.main.SGTeam sgt, Mothership mothership) {
		  this.SGTeam = sgt;
		  this.mothership = mothership;
	}

	public Jafa.kree.main.SGTeam getSGTeam() {
		return this.SGTeam;
	}

	public void setSGTeam(Jafa.kree.main.SGTeam sGTeam) {
		this.SGTeam = sGTeam;
	}

}
