package ExsPoliformismoCollections;

public class Cavalo extends Animal{
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	
	}
	public void emitirSom() {
		System.out.println("relinchando.. ");
	}
	public void correr() {
		System.out.println("trotando..");
	}
}
