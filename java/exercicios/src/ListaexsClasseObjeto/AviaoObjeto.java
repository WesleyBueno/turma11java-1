package ListaexsClasseObjeto;

public class AviaoObjeto {

	public static void main(String[] args) {
		Aviao ave = new Aviao (6, "LATAM", "EVERTON");
		System.out.print("Meu Jatinho tem: "+ ave.getAssento()+" assentos "+ "� da companhia �rea "+ave.getCompanhia()+ " seu piloto � o "+ ave.getPiloto());
	}

}
