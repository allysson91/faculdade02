package exercicioMer1;

public class funcionarioVO {
	
	private int idFuncionario;
	private String cpf;
	private String nome;
	private String sexo;
	private String dataNascimeto;
	private double salario;
	private int supervisor;
	private int departamentoId;
	private int cargoId;
	
	public funcionarioVO() {
		super();
		
	}

	public funcionarioVO(int idFuncionario, String cpf, String nome, String sexo, String dataNascimeto, double salario,
			int supervisor, int departamentoId, int cargoId) {
		super();
		this.idFuncionario = idFuncionario;
		this.cpf = cpf;
		this.nome = nome;
		this.sexo = sexo;
		this.dataNascimeto = dataNascimeto;
		this.salario = salario;
		this.supervisor = supervisor;
		this.departamentoId = departamentoId;
		this.cargoId = cargoId;
	}

	public int getId() {
		return idFuncionario;
	}

	public void setId(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDataNascimeto() {
		return dataNascimeto;
	}

	public void setDataNascimeto(String dataNascimeto) {
		this.dataNascimeto = dataNascimeto;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(int supervisor) {
		this.supervisor = supervisor;
	}

	public int getDepartamentoId() {
		return departamentoId;
	}

	public void setDepartamentoId(int departamentoId) {
		this.departamentoId = departamentoId;
	}

	public int getCargoId() {
		return cargoId;
	}

	public void setCargoId(int cargoId) {
		this.cargoId = cargoId;
	}
	
}
