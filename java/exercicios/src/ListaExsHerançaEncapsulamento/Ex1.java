package ListaExsHeran�aEncapsulamento;

public class Ex1 {

	public static void main(String[] args) {
		/*1. Cria uma Classe Pessoa, contendo os atributos encapsulados, 
		 * com seus respectivos seletores (getters) e modificadores (setters), 
		 * e ainda o construtor padr�o e pelo menos mais duas op��es de construtores conforme sua percep��o. 
		 * Atributos: String nome; String endere�o; String telefone; 
		 */
		Pessoa alguem= new Pessoa();
		alguem.setNome("Bruna");
		alguem.setEndereco("Rua das Belas, 1");
		alguem.setTelefone("3227-4116");
		System.out.println(alguem.getNome());
		System.out.println(alguem.getEndereco());
		System.out.println(alguem.getTelefone());
		
		
	}

}
