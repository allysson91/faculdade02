package exercicioMer1;

public class Projeto {
	
	private int idProjeto;
	private int idDepartamento;
	private String nome;
	private String descricao;
	
	public Projeto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Projeto(int idProjeto, int idDepartamento, String nome, String descricao) {
		super();
		this.idProjeto = idProjeto;
		this.idDepartamento = idDepartamento;
		this.nome = nome;
		this.descricao = descricao;
	}

	public int getIdProjeto() {
		return idProjeto;
	}

	public void setIdProjeto(int idProjeto) {
		this.idProjeto = idProjeto;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
