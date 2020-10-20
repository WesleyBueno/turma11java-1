package ListaExsHerançaEncapsulamento;

public class Ex5 {
	/*5. Implemente a classe Operario como subclasse da classe Pessoa. 
	 * Um determinado operário tem como atributos da classe Pessoa e também os 
	 * atributos próprios como valorProducao 
	 * (que corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário) 
	 * e comissao (que corresponde à porcentagem do 
	 * valorProducao que será adicionado ao vencimento base do operário).
	 *  
	 */
		private String nome;
		private int idade;
		private String etnia;


	public Ex5(String nome, int idade, String etnia) {
		
		this.nome = nome;
		this.idade = idade;
		this.etnia= etnia;
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
