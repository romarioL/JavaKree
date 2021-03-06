package Jafa.kree.main;

import java.util.ArrayList;
import java.util.Iterator;

public class Mothership {
	
	private SystemLord systemLord;
	
	private ArrayList<Jafa> jafas = new ArrayList<Jafa>();
	
	public Mothership(SystemLord s, ArrayList<Jafa> jafas) {
		this.systemLord = s;
		this.jafas = jafas;
	}
	
	public Mothership() {
		
	}
	public SystemLord getSystemLord() {
		return this.systemLord;
	}

	public void setSystemLord(SystemLord systemLord) {
		this.systemLord = systemLord;
	}

	public ArrayList<Jafa> getJafas() {
		return this.jafas;
	}

	public void setJafas(ArrayList<Jafa> jafas) {
		this.jafas = jafas;
	}
	
	public void addJafa(Jafa j) {
		this.jafas.add(j);
	}
	
	public String JafasSaudar() {	
		for(Iterator<Jafa> itr = this.jafas.iterator(); itr.hasNext();) {
			Jafa j = itr.next();
			 return j.saudar();
		}
		
		return null;
	}

}
