package Guanabara;

public class ContaBanco {

	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	// personalizados
	
	public void estadoAtual() {
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo"+ this.getTipo());
		System.out.println("Dono: "+ this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: "+ this.getStatus());
		
	}
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if(t=="CC") {
			this.setSaldo(50);
		}else if (t=="CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso!");
	}
	public void fecharConta() {
		if(this.getSaldo()>0) {
			System.out.println("Conta não pode ser fechada com saldo! ");
		}else if (this.getSaldo()<0) {
			System.out.println("Conta não pode ser fechada pois possui débitos!");	
		}else{
			this.setStatus(false);
			System.out.println("Conta encerrada com sucesso!");	
		}
		
	}
	public void depositar(double v) {
		if(this.getStatus()) {
			this.setSaldo(this.getSaldo()+v);
			System.out.println("Deposito realizado na conta de "+ this.getDono());	
		}else {
			System.out.println("Impossível depositar de uma conta fechada!");
		}
		
	}

	public void sacar(double v) {
		if(this.getStatus()) {
			if(this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo()-v);
				System.out.println("Saque realizado na conta de: " + this.getDono());
			}else {
				System.out.println("Impossível sacar de uma conta fechada");
			}
		}
	}
	public void pagarMensal() {
		int v=0;
		if(this.getTipo()=="CC") {
			v=12;
		}else if (this.getTipo()=="CP") {
			v=20;
		}
		if(this.getStatus()) {
			this.setSaldo(this.getSaldo()-v);
			System.out.println("Mensalidade paga com sucesso por " + this.getDono());
			
		}else {
			System.out.println("impossível pagar uma conta fechada!");
		}
	}
	public ContaBanco() {
	
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
}
