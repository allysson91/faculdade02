package exercicioMer1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DepartamentoDAO {

	public void inserirDepartamento(DepartamentoVO departamento) {

		try {
			ConexaoBanco con = new ConexaoBanco();
			Connection conexao = con.conectar();
			String sql = null;
			sql = ("insert into departamento (dep_nome, dep_id_gerente, dep_data_inicio_gerente) values (?, ?, ?)");
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, departamento.getNome());
			stmt.setInt(2, departamento.getIdGerente());
			stmt.setString(3, departamento.getDataInicoGerente());
			stmt.executeUpdate();
			conexao.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void listarDepartamento() {

		ConexaoBanco con = new ConexaoBanco();
		Connection conexao = con.conectar();
		String sql = null;
		sql = "select * from departamento";
		Statement stmt;
		try {
			stmt = conexao.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println("\nId departamento: " + rs.getInt(1));
				System.out.println("Nome departamento: " + rs.getString(2));
				System.out.println("Gerente do departamento: " + rs.getInt(3));
				System.out.println("Data de inicio do gerente no departamento: " + rs.getString(4) + "\n");

			}
			conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void buscarDepartamento(DepartamentoVO departamento) {

		ConexaoBanco con = new ConexaoBanco();
		Connection conexao = con.conectar();
		String sql = null;
		sql = "select * from departamento where dep_nome like '" + departamento.getNome() + "%'";
		Statement stmt;
		try {
			stmt = conexao.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println("\nId departamento: " + rs.getInt(1));
				System.out.println("Nome departamento: " + rs.getString(2));
				System.out.println("Gerente do departamento: " + rs.getInt(3));
				System.out.println("Data de inicio do gerente no departamento: " + rs.getString(4) + "\n");
			}
			conexao.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void excluirDepartamento(DepartamentoVO departamento) {

		try {
			ConexaoBanco con = new ConexaoBanco();
			Connection conexao = con.conectar();
			String sql = null;
			sql = "delete from departamento where dep_nome = ?";
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, departamento.getNome());
			stmt.executeUpdate();
			conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void alterarDepartamento(DepartamentoVO departamento) {

		try {
			ConexaoBanco con = new ConexaoBanco();
			Connection conexao = con.conectar();
			String sql = null;
			sql = "update departamento set dep_nome = ?, dep_id_gerente = ?, dep_data_inicio_gerente = ? where dep_id = ?";
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, departamento.getNome());
			stmt.setInt(2, departamento.getIdGerente());
			stmt.setString(3, departamento.getDataInicoGerente());
			stmt.setInt(4, departamento.getIdDepartamento());
			stmt.executeUpdate();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
