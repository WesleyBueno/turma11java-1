package ListaexsClasseObjeto;

public class Aviao {
	/*
	 * 2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe,
em seguida crie um objeto avião, defina as instancias deste objeto e apresente as informações deste 
objeto no console.
	 */
	public int assento;
	public String companhia;
	public String piloto;
	public Aviao(int assento, String companhia, String piloto) {
		super();
		this.assento = assento;
		this.companhia = companhia;
		this.piloto = piloto;
	}
	public int getAssento() {
		return assento;
	}
	public void setAssento(int assento) {
		this.assento = assento;
	}
	public String getCompanhia() {
		return companhia;
	}
	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}
	public String getPiloto() {
		return piloto;
	}
	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}

	

}

