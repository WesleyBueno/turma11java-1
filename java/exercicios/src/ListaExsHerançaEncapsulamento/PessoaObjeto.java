package ListaExsHeran�aEncapsulamento;

public class PessoaObjeto {

	public static void main(String[] args) {
	
		PessoaOP PessoaObjeto= new PessoaOP("Carlos",59,"Negro","Crach1","Botas","Empilhadeirista");
		
		System.out.println(" Nome "+ PessoaObjeto.getNome()+" Idade "+ PessoaObjeto.getIdade()+" Etnia "+PessoaObjeto.getEtnia()+ " " + "Tipo de Crach�: " +PessoaObjeto.getCracha()+ " "+ "EPI: "+ PessoaObjeto.getEpi() + " Profiss�o: "+ PessoaObjeto.getProfissao());
		
	}

}
