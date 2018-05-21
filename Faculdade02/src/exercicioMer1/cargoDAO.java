package exercicioMer1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class cargoDAO {
	
	public void inserirCargo(cargoVO cargo) throws SQLException {
		
		conexaoBanco con = new conexaoBanco();
		Connection conexao = con.conectar();
		String sql = ("insert into cargo (car_nome, car_descricacao) values (?, ?)");
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, cargo.getNome());
		stmt.setString(2, cargo.getDescricao());
		stmt.executeUpdate();
		conexao.commit();
		
	}

}
