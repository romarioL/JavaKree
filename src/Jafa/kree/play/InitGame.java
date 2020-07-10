package Jafa.kree.play;
import java.util.ArrayList;

import Jafa.kree.main.*;

public class InitGame {
	
	private ArrayList<Jafa> jafas;
	private SystemLord systemLord;
	private ArrayList<Human> humans;
	private Captain captain;
	

	public InitGame(ArrayList<Jafa> jafas,
			SystemLord s, 
			ArrayList<Human> sgTeam, 
			Captain c) {
		   this.jafas = jafas;
		   this.systemLord = s;
		   this.humans = sgTeam;
		   this.captain = c;
	}

	public ArrayList<Jafa> getJafas() {
		return this.jafas;
	}

	public void setJafa(ArrayList<Jafa> jafas) {
		this.jafas = jafas;
	}

	
	public ArrayList<Human> getHumans() {
		return this.humans;
	}

	public void setHumans(ArrayList<Human> humans) {
		this.humans = humans;
	}

	public SystemLord getSystemLord() {
		return this.systemLord;
	}

	public void setSystemLord(SystemLord systemLord) {
		this.systemLord = systemLord;
	}

	public Captain getCaptain() {
		return this.captain;
	}

	public void setCaptain(Captain captain) {
		this.captain = captain;
	}
	
	public String Init(int jafaLife, int humanLife) {
		Mothership m = new Mothership(systemLord, jafas);
		SGTeam s = new SGTeam(humans, captain);
		Game g = new Game(s, m);
		return g.Play(jafaLife, humanLife);
	}
	
	

}
