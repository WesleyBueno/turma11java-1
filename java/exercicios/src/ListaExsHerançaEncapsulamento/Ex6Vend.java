package ListaExsHerançaEncapsulamento;

public class Ex6Vend extends Ex6 {

	private double comissao;
	private String credencial;
	private double salario;
	public Ex6Vend(String nome, int idade, String etnia, double comissao, String credencial, double salario) {
		super(nome, idade, etnia);
		this.comissao = comissao;
		this.credencial = credencial;
		this.salario = salario;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public String getCredencial() {
		return credencial;
	}
	public void setCredencial(String credencial) {
		this.credencial = credencial;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}


}