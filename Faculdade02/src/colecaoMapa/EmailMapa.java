package colecaoMapa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmailMapa {

	public static void main(String[] args) {

		Map<String, List<String>> mapaEmail = new HashMap<>();
		List<String> listaContrato = new ArrayList<>();

		listaContrato.add("877900 ");
		listaContrato.add("43212 ");
		listaContrato.add("362977 ");

		mapaEmail.put("financeiro@uol.com.br", listaContrato);
		mapaEmail.put("suporte@hotmail.com", listaContrato);
		mapaEmail.put("cot@empresa.com.br", listaContrato);

		listaContrato = new ArrayList<>();

		listaContrato.add("1234321 ");

		mapaEmail.put("diretor@empresaaguas.com.br", listaContrato);

		

		Iterator<String> it = mapaEmail.keySet().iterator();
		while (it.hasNext()) {
			StringBuilder str = new StringBuilder();
			String chave = it.next();
			List<String> listaCon = mapaEmail.get(chave);
			for (String contrato : listaCon) {
				str.append("Contrato: ");
				str.append(contrato);
				str.append("Envolvido em intervenção. \n");

			}

			System.out.println("Enviando email para: " + chave);
			System.out.println("Contratos: \n" + str);

		}

	}

}
