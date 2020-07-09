package Jafa.kree.play;

import java.util.ArrayList;
import java.util.Iterator;

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
		return this.mothership;
	}

	public void setMothership(Mothership mothership) {
		this.mothership = mothership;
	}
	
	public String Play(int jafaLife, int humanLife) {
		ArrayList<Jafa.kree.main.Human> humans = this.SGTeam.getHumans();
		ArrayList<Jafa.kree.main.Jafa> jafas = this.mothership.getJafas();
		
		int lifeJafa = 0;
		int lifeHuman = 0;
		
		for(Iterator<Jafa.kree.main.Human> itr = humans.iterator(); itr.hasNext();) {
			Jafa.kree.main.Human h = itr.next();
			lifeHuman += h.viver(humanLife);
		}
		
		for(Iterator<Jafa.kree.main.Jafa> itr = jafas.iterator(); itr.hasNext();) {
			Jafa.kree.main.Jafa j = itr.next();
			lifeJafa += j.viver(lifeJafa);
		}
		
		if(lifeJafa > lifeHuman) {
			return "Mothership has winn";
		}else {
			return "SGTeam has winn";
		}
		
	}

}
