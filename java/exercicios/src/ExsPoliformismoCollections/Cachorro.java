package ExsPoliformismoCollections;

public class Cachorro extends Animal {
 
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	public void emitirSom() {
		System.out.println("Auau");
	}
	public void correr() {
		System.out.println("Correndo..");
	}
	
}
