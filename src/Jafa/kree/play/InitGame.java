package Jafa.kree.play;

import java.util.ArrayList;

public class InitGame {

   private ArrayList<Jafa.kree.main.Human> human;
   private ArrayList<Jafa.kree.main.Captain> captain;
   private ArrayList<Jafa.kree.main.Jafa> jafa;
   private ArrayList<Jafa.kree.main.SystemLord> systemLord;
   
   
   
   
   
	public InitGame(ArrayList<Jafa.kree.main.Human> h, 
			ArrayList<Jafa.kree.main.Captain> cap, 
			ArrayList<Jafa.kree.main.Jafa> jafa, 
			ArrayList<Jafa.kree.main.SystemLord> systemLord) {        
		        this.human = h;
		        this.captain = cap;
		        this.jafa = jafa;
		        this.systemLord = systemLord;			
	}





	public ArrayList<Jafa.kree.main.Human> getHuman() {
		return this.human;
	}





	public void setHuman(ArrayList<Jafa.kree.main.Human> human) {
		this.human = human;
	}





	public ArrayList<Jafa.kree.main.Captain> getCaptain() {
		return this.captain;
	}





	public void setCaptain(ArrayList<Jafa.kree.main.Captain> captain) {
		this.captain = captain;
	}





	public ArrayList<Jafa.kree.main.Jafa> getJafa() {
		return this.jafa;
	}





	public void setJafa(ArrayList<Jafa.kree.main.Jafa> jafa) {
		this.jafa = jafa;
	}





	public ArrayList<Jafa.kree.main.SystemLord> getSystemLord() {
		return this.systemLord;
	}





	public void setSystemLord(ArrayList<Jafa.kree.main.SystemLord> systemLord) {
		this.systemLord = systemLord;
	}





}
