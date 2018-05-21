package exercicioMer1;

import java.sql.SQLException;
import java.util.Scanner;

public class mainteste {
	static Scanner scan = new Scanner (System.in);
	
	public static void main(String[] args) throws SQLException {
		
		new mainteste().teste();
		
	}
	
	public void teste() throws SQLException {

		cargoVO cargo = new cargoVO();
		
		System.out.println("Informe o nome do cargo: ");
		cargo.setNome(scan.next());
		System.out.println("Informe a descricao");
		cargo.setDescricao(scan.next());
		cargoDAO dao = new cargoDAO();
		System.out.println(cargo.getNome());
		System.out.println(cargo.getDescricao());
		dao.inserirCargo(cargo);
	}

}
