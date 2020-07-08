package Jafa.kree.main;

import java.util.ArrayList;
import java.util.Iterator;

public class SGTeam {
	
	private ArrayList<Human> humans;
	private Captain captain;

	public ArrayList<Human> getHumans() {
		return this.humans;
	}

	public void setHumans(ArrayList<Human> human) {
		this.humans = human;
	}
	
	public void addHuman(Human h) {
		humans.add(h);
	}

	public Captain getCaptain() {
		return this.captain;
	}

	public void setCaptain(Captain captain) {
		this.captain = captain;
	}
	
	public String askForTeamOrders() {
		for(Iterator<Human> itr = this.humans.iterator(); itr.hasNext();) {
			Human h = itr.next();
			return h.askForMission();
		}
		
		return null;
	}

}
