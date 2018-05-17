package colecaoMapa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainMapa {

	public static void main(String[] args) {

		Map<String, List> mapaEmail = new HashMap<>();
		Map<String, String> mapaString = new HashMap<>();

		mapaString.put("1", " Aula de mapa");
		mapaString.put("2", " Aula de set");
		System.out.println("Mapa string: " + mapaString);

		Map<Integer, String> mapaInteger = new HashMap<>();

		mapaInteger.put(1, " Aula de mapa");
		mapaInteger.put(2, " Aula de set");
		System.out.println(" Mapa integer: " + mapaInteger);

		System.out.println("Mapa posição Integer: "+mapaInteger.get(1));
		System.out.println("Mapa posição String:  "+mapaString.get("2"));
		
	}

}
