package exemploInstanceOf;

import java.sql.SQLException;

public class ExemploInstanceOf {

	public static void main(String[] args) {
		new ExemploInstanceOf().processar();
	}

	private void processar() {

		try {
			validarCPF(0);
			consultarCLientesAdimplentes();
		} catch (Exception e) {
			System.out.println("MSG:"+ e.getMessage());
			if (e instanceof SQLException) {
				System.out.println("Código erro SQL:"+((SQLException)e).getErrorCode());
			}
		}
		
		
	}

	private void validarCPF(long meuCpf) throws Exception {

		if (meuCpf == 0) {
			throw new Exception("Cpf inválido");
			
		}

	}

	private void consultarCLientesAdimplentes() {

		// fara acesso ao bd
		MInhaConexaoInstanceOf conecta = new MInhaConexaoInstanceOf();
		conecta.obterConexao();

	}

}
