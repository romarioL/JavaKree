import Jafa.kree.main.Jafa;
import Jafa.kree.main.Mothership;
import Jafa.kree.main.SystemLord;

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
		System.out.println(j.saudar());
        System.out.println(j.marchar(4));
        System.out.println(j.marchar(150));
        System.out.println(j.viver(1400));
        System.out.println(j.viver(2000));
        
        SystemLord s = new SystemLord();
        System.out.println(s.pedancy());
        System.out.println(s.destroy(4));
        System.out.println(s.destroy(100));
        System.out.println(s.orders(j));
        j.setSystemLord(s);
        
        Mothership m = new Mothership();
        m.addJafa(j);
        m.addJafa(j2);
        m.addJafa(j3);
        m.addJafa(j4);
        m.addJafa(j5);
        
        m.JafasSaudar();
        
        
        
        

	}
	
	

}
