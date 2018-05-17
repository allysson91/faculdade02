package exemploInstanceOf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MInhaConexaoInstanceOf {
	
	public void obterConexao() {
		//driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver do mysql não encontrado");
		}
		//url
		String url = "jdbc:mysql://localhost:3306/EMPRESA";
		
		//DriverManager
		try {
			Connection conexao = DriverManager.getConnection(url,"root","gz6387x6");
		} catch (SQLException e) {
			System.out.println("não foi possivel conecatar");
		}
		
	}

}
