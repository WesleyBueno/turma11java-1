package ListaexsClasseObjeto;

import java.util.Scanner;

public class ContaBancaria {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		Ex6ContaBancaria cB= new Ex6ContaBancaria();
		
		cB.nomeCliente="Bruna";
		cB.agenciaBancaria= 46;
		cB.contaBancaria= 13029;
		cB.Saldo=10000.00;
		
		
		System.out.println(cB.nomeCliente+ "\n" + cB.agenciaBancaria + "\n"+ cB.contaBancaria+ "\n"+ cB.Saldo );
	tec.close();
	}

}
