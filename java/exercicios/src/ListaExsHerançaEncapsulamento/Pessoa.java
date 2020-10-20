package ListaExsHerançaEncapsulamento;

public class Pessoa {
	
	private String nome; 
	private String endereco;
	public String telefone;
	
	//construtor
	public Pessoa() {
		
		//sobrecarga do construtor
	}
	public Pessoa(String endereco) {
		this.endereco= endereco;
	}
	public Pessoa(String nome, String telefone) {
		
		this.nome = nome;
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	
	 

}
