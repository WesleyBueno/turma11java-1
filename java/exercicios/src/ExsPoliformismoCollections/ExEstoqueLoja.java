package ExsPoliformismoCollections;

import java.util.ArrayList;

public class ExEstoqueLoja {

	public static void main(String[] args) {
		/*Crie uma um programa para trabalhar com estoque de uma loja, 
		 * o programa dever� trabalhar com Collection do tipo List do Java para manipular 
		 * os dados desse estoque, 
		 * o programa dever� atender as seguintes funcionalidades:
		 * Armazenar dados da List; Remover dados da list; 
		 * Atualizar dados da list; Apresentar todos os dados da list.
		 */
		
		/*String estoque1= "Camisa";
		String estoque2= "Vestido";
		String estoque3= "Cal�a";
		*/
		
		ArrayList<String> estoque= new ArrayList<>();
		
		estoque.add("Camisa");
		estoque.add("Vestido");
		estoque.add("Cal�a");
		
		System.out.println(estoque);
		
		estoque.remove(1);
		
		System.out.println(estoque);
		
		

	}

}
