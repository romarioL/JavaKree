import Jafa.kree.main.Jafa;
import Jafa.kree.main.SystemLord;

public class LiberdadeProsJafa {

	public static void main(String[] args) {
		System.out.println("Liberta os Jafa, pô");
		Jafa j = new Jafa();
		j.setNome("Tealc");
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
        
        

	}
	
	

}
