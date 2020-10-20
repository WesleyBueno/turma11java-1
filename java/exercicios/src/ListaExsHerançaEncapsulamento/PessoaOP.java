package ListaExsHerançaEncapsulamento;

public class PessoaOP extends Ex5{

	private String cracha;
	private String epi;
	private String profissao;
	
	public PessoaOP(String nome, int idade, String etnia, String cracha, String epi, String profissao) {
		super(nome, idade, etnia);
		this.cracha=cracha;
		this.epi=epi;
		this.profissao=profissao;
		
	}

	public String getCracha() {
		return cracha;
	}

	public void setCracha(String cracha) {
		this.cracha = cracha;
	}

	public String getEpi() {
		return epi;
	}

	public void setEpi(String epi) {
		this.epi = epi;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
}
