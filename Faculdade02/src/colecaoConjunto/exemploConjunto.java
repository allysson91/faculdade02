package colecaoConjunto;

import java.util.HashSet;
import java.util.Set;

public class exemploConjunto {

	public static void main(String[] args) {
		
		Set<String> conjunto = new HashSet<>();
		conjunto.add("Allysson");
		conjunto.add("Allysson");
		conjunto.add("Allysson");
		conjunto.add("Allysson");
		conjunto.add("Jão");
		
		for (String string : conjunto) {
			System.out.println("String: "+ string);
		}
		
	}
	
}
