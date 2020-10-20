package ListaExsHerançaEncapsulamento;

public class ObjetoPVend {

	public static void main(String[] args) {
		Ex6Vend opv= new Ex6Vend("Gerusa", 29, "Negro", 3000, "VendedoraVip", 5000);
		
		System.out.println("Nome: "+opv.getNome());
		System.out.println("Idade: "+ opv.getIdade());
		System.out.println("Etnia: "+ opv.getEtnia());
		System.out.println("Comissão: "+ opv.getComissao());
		System.out.println("Credencial: " + opv.getCredencial());
		System.out.println("Salário: " + opv.getSalario());
		

	}

}
