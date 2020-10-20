package ListaExsHerançaEncapsulamento;

public class Ex6 {

	private String nome;
	private int idade;
	private String etnia;
	public Ex6(String nome, int idade, String etnia) {
		
		this.nome = nome;
		this.idade = idade;
		this.etnia = etnia;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEtnia() {
		return etnia;
	}
	public void setEtnia(String etnia) {
		this.etnia = etnia;
	}
	
}
