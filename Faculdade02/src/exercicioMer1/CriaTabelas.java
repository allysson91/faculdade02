package exercicioMer1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriaTabelas {


	public void criacaoTabela() throws SQLException {

		 ConexaoBanco con = new ConexaoBanco();
		 Connection conexao = con.conectar();
		 String comando = null;
		 comando = "create table vendam(ven_id integer primary key, ven_nome_vendedor varchar (45))";
		 Statement stmt = conexao.createStatement();
		 stmt.executeUpdate(comando);
		 
		
	}
}
