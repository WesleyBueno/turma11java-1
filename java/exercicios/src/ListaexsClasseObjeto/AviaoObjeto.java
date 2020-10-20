package ListaexsClasseObjeto;

public class AviaoObjeto {

	public static void main(String[] args) {
		Aviao ave = new Aviao (6, "LATAM", "EVERTON");
		System.out.print("Meu Jatinho tem: "+ ave.getAssento()+" assentos "+ "é da companhia Área "+ave.getCompanhia()+ " seu piloto é o "+ ave.getPiloto());
	}

}
