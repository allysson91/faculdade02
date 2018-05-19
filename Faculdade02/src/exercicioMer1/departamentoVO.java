package exercicioMer1;

public class departamentoVO {

	private int idDepartamento;
	private String nome;
	private int idGerente;
	private String dataInicoGerente;
	
	public departamentoVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public departamentoVO(int idDepartamento, String nome, int idGerente, String dataInicoGerente) {
		super();
		this.idDepartamento = idDepartamento;
		this.nome = nome;
		this.idGerente = idGerente;
		this.dataInicoGerente = dataInicoGerente;
	}

	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdGerente() {
		return idGerente;
	}

	public void setIdGerente(int idGerente) {
		this.idGerente = idGerente;
	}

	public String getDataInicoGerente() {
		return dataInicoGerente;
	}

	public void setDataInicoGerente(String dataInicoGerente) {
		this.dataInicoGerente = dataInicoGerente;
	}
	
	
}
