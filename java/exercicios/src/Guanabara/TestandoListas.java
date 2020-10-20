package Guanabara;

import java.util.ArrayList;

public class TestandoListas {

	public static void main(String[] args) {
	String aula1= "Conhecendo mais de Listas";
	String aula2= "Modelando a Classe Aula";
	String aula3= "Trabalhando com Cursos e Sets";
	
	ArrayList<String> aulas= new ArrayList<>();
	aulas.add(aula1);
	aulas.add(aula2);
	aulas.add(aula3);
	
	System.out.println(aulas);
	
	aulas.remove(0);
	
	System.out.println(aulas);

	}

}
