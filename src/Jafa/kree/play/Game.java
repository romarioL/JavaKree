package Jafa.kree.play;

import Jafa.kree.main.Mothership;

public class Game {
	
	private Jafa.kree.main.SGTeam SGTeam;
	private Mothership mothership;
	
	public Game(Jafa.kree.main.SGTeam sgt, Mothership mothership) {
		  this.SGTeam = sgt;
		  this.setMothership(mothership);
	}

	public Jafa.kree.main.SGTeam getSGTeam() {
		return this.SGTeam;
	}

	public void setSGTeam(Jafa.kree.main.SGTeam sGTeam) {
		this.SGTeam = sGTeam;
	}

	public Mothership getMothership() {
		return mothership;
	}

	public void setMothership(Mothership mothership) {
		this.mothership = mothership;
	}

}
