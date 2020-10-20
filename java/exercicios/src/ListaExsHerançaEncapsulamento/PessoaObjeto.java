package ListaExsHerançaEncapsulamento;

public class PessoaObjeto {

	public static void main(String[] args) {
	
		PessoaOP PessoaObjeto= new PessoaOP("Carlos",59,"Negro","Crach1","Botas","Empilhadeirista");
		
		System.out.println(" Nome "+ PessoaObjeto.getNome()+" Idade "+ PessoaObjeto.getIdade()+" Etnia "+PessoaObjeto.getEtnia()+ " " + "Tipo de Crachá: " +PessoaObjeto.getCracha()+ " "+ "EPI: "+ PessoaObjeto.getEpi() + " Profissão: "+ PessoaObjeto.getProfissao());
		
	}

}
