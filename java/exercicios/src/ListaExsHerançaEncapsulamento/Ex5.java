package ListaExsHeran�aEncapsulamento;

public class Ex5 {
	/*5. Implemente a classe Operario como subclasse da classe Pessoa. 
	 * Um determinado oper�rio tem como atributos da classe Pessoa e tamb�m os 
	 * atributos pr�prios como valorProducao 
	 * (que corresponde ao valor monet�rio dos artigos efetivamente produzidos pelo oper�rio) 
	 * e comissao (que corresponde � porcentagem do 
	 * valorProducao que ser� adicionado ao vencimento base do oper�rio).
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
