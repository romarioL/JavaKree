package Jafa.kree.main;

import java.util.ArrayList;

public class CreateSGTeam {
	
	public SGTeam create(ArrayList<Human> h, Captain c){
		return new SGTeam(h, c);
	}
}
