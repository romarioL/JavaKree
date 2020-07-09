package Jafa.kree.play;

import java.util.ArrayList;
import Jafa.kree.main.SGTeam;
import Jafa.kree.main.Human;
import Jafa.kree.main.Jafa;
import  Jafa.kree.main.Mothership;
import java.util.Iterator;


public class Game {
	
	private SGTeam SGTeam;
	private Mothership mothership;
	
	public Game(SGTeam sgt, Mothership mothership) {
		  this.SGTeam = sgt;
		  this.setMothership(mothership);
	}

	public SGTeam getSGTeam() {
		return this.SGTeam;
	}

	public void setSGTeam(SGTeam sGTeam) {
		this.SGTeam = sGTeam;
	}

	public Mothership getMothership() {
		return this.mothership;
	}

	public void setMothership(Mothership mothership) {
		this.mothership = mothership;
	}
	
	public String Play(int jafaLife, int humanLife) {
		ArrayList<Human> humans = this.SGTeam.getHumans();
		ArrayList<Jafa> jafas = this.mothership.getJafas();
		
		int lifeJafa = 0;
		int lifeHuman = 0;
		
		for(Iterator<Human> itr = humans.iterator(); itr.hasNext();) {
			Human h = itr.next();
			lifeHuman += h.viver(humanLife);
		}
		
		for(Iterator<Jafa> itr = jafas.iterator(); itr.hasNext();) {
			Jafa j = itr.next();
			lifeJafa += j.viver(lifeJafa);
		}
		
		if(lifeJafa > lifeHuman) {
			return "Mothership has winn";
		}else {
			return "SGTeam has winn";
		}
		
	}

}
