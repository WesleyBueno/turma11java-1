package Guanabara;

public class Caneta {
	public String modelo;
	public String cor; 
	double ponta;
	protected int carga;
	protected boolean tampada;
	public void status() {
		System.out.println(" Modelo: "+ this.modelo);
		System.out.print(" Uma Caneta "+ this.cor);
		System.out.println("\n Ponta : " + this.ponta);
		System.out.println(" Carga: "+ this.carga);
		System.out.println(" Est� tampada? : "+ this.tampada);
		
	}
	
	public void rabiscar() {
		if(this.tampada==true) {
		System.out.println("ERRO! N�o posso rabiscar");
	}else {
		System.out.println("Estou Rabiscando..");}
	}
	protected void tampar() {
		this.tampada=true;
	}
	
	protected void destampar() {
		this.tampada=false;
	}
	
}
