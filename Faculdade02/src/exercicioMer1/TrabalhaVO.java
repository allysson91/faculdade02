package exercicioMer1;

public class TrabalhaVO {

	private int idFUncionario;
	private int idProjeto;
	private int horasTrabalhadas;
	
	public TrabalhaVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TrabalhaVO(int idFUncionario, int idProjeto, int horasTrabalhadas) {
		super();
		this.idFUncionario = idFUncionario;
		this.idProjeto = idProjeto;
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	public int getIdFUncionario() {
		return idFUncionario;
	}
	public void setIdFUncionario(int idFUncionario) {
		this.idFUncionario = idFUncionario;
	}
	public int getIdProjeto() {
		return idProjeto;
	}
	public void setIdProjeto(int idProjeto) {
		this.idProjeto = idProjeto;
	}
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	
	
}
