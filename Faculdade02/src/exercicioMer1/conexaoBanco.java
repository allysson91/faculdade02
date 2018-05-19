package exercicioMer1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexaoBanco {

	public Connection conectar() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver não encontrado");
		}
		String url = "jdbc:mysql://localhost:3306/teste";
		Connection conecta;
		try {
			conecta = DriverManager.getConnection(url, "root", "gz6387x6");
			return conecta;
		} catch (SQLException e) {
			System.out.println("erro conexão.");
		}
		return null;
	}

}
