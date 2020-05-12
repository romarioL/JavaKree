package Jafa.kree.main;

import java.util.ArrayList;
import java.util.Iterator;

public class Mothership {
	
	private SystemLord systemLord;
	
	private ArrayList<Jafa> jafas = new ArrayList<Jafa>();
	

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
		jafas.add(j);
	}
	
	public void JafasSaudar() {
		Iterator<Jafa>  itr = jafas.iterator();
		while(itr.hasNext()) {
			 Jafa j = itr.next();
			 System.out.println(j.saudar());
		}
	}

}
