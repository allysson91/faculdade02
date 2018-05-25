package exercicioMer1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CargoDAO {

	public void inserirCargo(CargoVO cargo) {

		try {
			ConexaoBanco con = new ConexaoBanco();
			Connection conexao = con.conectar();
			String sql = null;
			sql = ("insert into cargo (car_nome, car_descricao) values (?, ?)");
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, cargo.getNome());
			stmt.setString(2, cargo.getDescricao());
			stmt.executeUpdate();
			conexao.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void listarCargo() {

		ConexaoBanco con = new ConexaoBanco();
		Connection conexao = con.conectar();
		String sql = null;
		sql = "select * from cargo";
		Statement stmt;
		try {
			stmt = conexao.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println("\nId cargo: " + rs.getInt(1));
				System.out.println("Nome cargo: " + rs.getString(2));
				System.out.println("Descrição cargo: " + rs.getString(3) + "\n");
			}
			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void buscarCargo(CargoVO cargo) {

		ConexaoBanco con = new ConexaoBanco();
		Connection conexao = con.conectar();
		String sql = null;
		sql = "select * from cargo where car_nome like '" + cargo.getNome() + "%'";
		Statement stmt;
		try {
			stmt = conexao.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println("\nId cargo: " + rs.getInt(1));
				System.out.println("Nome cargo: " + rs.getString(2));
				System.out.println("Descrição cargo: " + rs.getString(3) + "\n");
			}
			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void excluirCargo(CargoVO cargo) {

		try {
			ConexaoBanco con = new ConexaoBanco();
			Connection conexao = con.conectar();
			String sql = null;
			sql = "delete from cargo where car_nome = ?";
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, cargo.getNome());
			stmt.executeUpdate();
			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void alterarCargo(CargoVO cargo) {

		try {
			ConexaoBanco con = new ConexaoBanco();
			Connection conexao = con.conectar();
			String sql = null;
			sql = "update cargo set car_nome = ?, car_descricao = ? where car_id = ?";
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, cargo.getNome());
			stmt.setString(2, cargo.getDescricao());
			stmt.setInt(3, cargo.getIdCargo());
			stmt.executeUpdate();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
