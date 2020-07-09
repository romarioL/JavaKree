package Jafa.kree.play;

import java.util.ArrayList;
import Jafa.kree.main.Human;
import Jafa.kree.main.Captain;
import Jafa.kree.main.Jafa;
import Jafa.kree.main.SystemLord;

public class InitGame {

   private ArrayList<Human> human;
   private ArrayList<Captain> captain;
   private ArrayList<Jafa> jafa;
   private ArrayList<SystemLord> systemLord;
   
   
   
   
   
	public InitGame(ArrayList<Human> h, 
			ArrayList<Captain> cap, 
			ArrayList<Jafa> jafa, 
			ArrayList<SystemLord> systemLord) {        
		        this.human = h;
		        this.captain = cap;
		        this.jafa = jafa;
		        this.systemLord = systemLord;			
	}





	public ArrayList<Human> getHuman() {
		return this.human;
	}





	public void setHuman(ArrayList<Human> human) {
		this.human = human;
	}





	public ArrayList<Captain> getCaptain() {
		return this.captain;
	}





	public void setCaptain(ArrayList<Captain> captain) {
		this.captain = captain;
	}





	public ArrayList<Jafa> getJafa() {
		return this.jafa;
	}





	public void setJafa(ArrayList<Jafa> jafa) {
		this.jafa = jafa;
	}





	public ArrayList<SystemLord> getSystemLord() {
		return this.systemLord;
	}





	public void setSystemLord(ArrayList<SystemLord> systemLord) {
		this.systemLord = systemLord;
	}
    
	
	
	public String  PlayGame(Game g, int jafaLife, int humanLife) {	
		return g.Play(jafaLife, humanLife);	
	}




}
