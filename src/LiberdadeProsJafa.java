import java.util.ArrayList;

import Jafa.kree.main.BercarioGoauld;
import Jafa.kree.main.BercarioJafa;
import Jafa.kree.main.BercarioNaveMae;
import Jafa.kree.main.Captain;
import Jafa.kree.main.Human;
import Jafa.kree.main.Jafa;
import Jafa.kree.main.Mothership;
import Jafa.kree.main.SGTeam;
import Jafa.kree.main.SystemLord;
import Jafa.kree.play.Game;

public class LiberdadeProsJafa {

	public static void main(String[] args) {
		System.out.println("Liberta os Jafa, pô");
		Jafa j = new Jafa();
		j.setNome("Tealc");
		Jafa j2 = new Jafa();
		j2.setNome("Bettet");
		Jafa j3 = new Jafa();
		j3.setNome("Lucifer");
		Jafa j4 = new Jafa();
		j4.setNome("Gay");
		Jafa j5 = new Jafa();
		j5.setNome("Dimas");
        
        SystemLord s = new SystemLord();
        System.out.println(s.pedancy());
        System.out.println(s.destroy(4));
        System.out.println(s.destroy(100));
        System.out.println(s.orders(j));
        j.setSystemLord(s);
        
      
        
        Human h = new Human();
        h.setNome("Helloi");
        Human h2 = new Human();
        h2.setNome("Helloi");
        Human h3 = new Human();
        h3.setNome("Helloi");
        Human h4 = new Human();
        h4.setNome("Helloi");
        Human h5 = new Human();
        h5.setNome("Helloi");
        Human h6 = new Human();
        h6.setNome("Helloi");
       
        
       
     
        
        
        
        ArrayList<Jafa> jafas = new ArrayList<Jafa>();
        jafas.add(j);
        jafas.add(j2);
        jafas.add(j3);
        jafas.add(j4);
        jafas.add(j5);
        
        ArrayList<Human> SgTeam = new ArrayList<Human>();
        SgTeam.add(h);
        SgTeam.add(h2);
        SgTeam.add(h3);
        SgTeam.add(h4);
        SgTeam.add(h5);
        
        Captain c = new Captain();
        c.setNome("Jesuis");
        
        Mothership m = new Mothership(s, jafas);
        SGTeam sgt = new SGTeam(SgTeam, c);
        
        Game g = new Game(sgt, m);
        System.out.println(g.Play(100, 150));
        
      

	}
	
	

}
