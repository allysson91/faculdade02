package exercicioMer1;

public class enderecoVO {
	
	private int idEndereco;
	private int codFuncionario;
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private String cep;
	
	public enderecoVO() {
		super();
		
	}
	
	public enderecoVO(int idEndereco, int codFuncionario, String rua, int numero, String bairro, String cidade,
			String cep) {
		super();
		this.idEndereco = idEndereco;
		this.codFuncionario = codFuncionario;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
	}
	
	public int getIdEndereco() {
		return idEndereco;
	}
	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}
	public int getCodFuncionario() {
		return codFuncionario;
	}
	public void setCodFuncionario(int codFuncionario) {
		this.codFuncionario = codFuncionario;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}

}
