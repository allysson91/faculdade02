package createTable;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class CreateTable {
	
	
	public static void main(String[] args) {
		
		try {
			new CreateTable().processar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void processar() throws SQLException {
		
		criarTabelaVenda();
		
		
	}
	
	public void criarTabelaVenda() throws SQLException {
		
		String comandoSQL = null;
		comandoSQL = "create table vendam(ven_id integer primary key, ven_nome_vendedor varchar (45));";
		Connection vendaCon = obterConexao();
		if(vendaCon != null) {
			Statement stmt =  (Statement) vendaCon.createStatement();
			stmt.executeUpdate(comandoSQL);
		}else {
			System.out.println("Problema na caralha da conexão");
		}


		
	}
	
	
	
	public Connection obterConexao(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver não disponivel");
		}
		String url = "jdbc:mysql://localhost:3306/aulajava";
		// Connection con;
		try  {
			Connection con = (Connection) DriverManager.getConnection(url, "root", "gz6387x6");
			return con;
		} catch (SQLException e) {
			System.out.println("Usuário ou senha inválido");
		}
		return null;
	}

}
