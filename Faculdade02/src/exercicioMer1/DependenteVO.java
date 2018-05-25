package exercicioMer1;

public class DependenteVO {
	
	private int idFuncionario;
	private int idDependente;
	private String Nome;
	private String sexo;
	private String parentesco;
	private String dataNascimento;
	
	public DependenteVO() {
		super();
		
	}
	
	public DependenteVO(int idFuncionario, int idDependente, String nome, String sexo, String parentesco,
			String dataNascimento) {
		super();
		this.idFuncionario = idFuncionario;
		this.idDependente = idDependente;
		Nome = nome;
		this.sexo = sexo;
		this.parentesco = parentesco;
		this.dataNascimento = dataNascimento;
	}
	
	public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public int getIdDependente() {
		return idDependente;
	}
	public void setIdDependente(int idDependente) {
		this.idDependente = idDependente;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getParentesco() {
		return parentesco;
	}
	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
