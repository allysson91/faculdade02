package exercicioMer1;

import java.sql.SQLException;
import java.util.Scanner;

public class mainteste {
	static Scanner scan = new Scanner (System.in);
	criaTabelas cria = new criaTabelas();
	
	public static void main(String[] args) {
		
		//new mainteste().cria.criacaoTabela();
		try {
			new mainteste().teste();
		} catch (SQLException e) {
			System.out.println("erro x048146520");
			e.printStackTrace();
		}
		
	}
	
	public void teste() throws SQLException {

		
		// testes de crud mo da fo quer
		cargoVO cargo = new cargoVO();
		cargoDAO dao = new cargoDAO();
		//dao.listarCargo();
		System.out.println("Informe id: ");
		cargo.setIdCargo(scan.nextInt());
		System.out.println("Informe o nome do cargo: ");
		cargo.setNome(scan.next());
		System.out.println("Informe nova descricao");
		cargo.setDescricao(scan.next());
		dao.alterarCargo(cargo);
		//dao.buscarCargo(cargo);
		/*System.out.println("Informe o nome do cargo: ");
		cargo.setNome(scan.next());
		System.out.println("Informe a descricao");
		cargo.setDescricao(scan.next());		
		System.out.println(cargo.getNome());
		System.out.println(cargo.getDescricao());
		dao.inserirCargo(cargo);*/
	}

}
