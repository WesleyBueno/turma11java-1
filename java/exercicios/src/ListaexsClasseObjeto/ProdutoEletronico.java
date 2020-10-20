package ListaexsClasseObjeto;

public class ProdutoEletronico {
/*3) Crie uma classe produto eletrônico e apresente os atributos e métodos 
 * referentes esta classe, em seguida crie um objeto produto eletrônico, 
 * defina as instancias deste objeto e apresente as informações deste objeto no console.
 */
	public String nomeCel;
	public String corCel;
	public String modeloCel;
	public ProdutoEletronico(String nomeCel, String corCel, String modeloCel) {
		
		this.nomeCel = nomeCel;
		this.corCel = corCel;
		this.modeloCel = modeloCel;
		
		
	}
	
	public String getNomeCel() {
		return nomeCel;
	}
	public void setNomeCel(String nomeCel) {
		this.nomeCel = nomeCel;
	}
	public String getCorCel() {
		return corCel;
	}
	public void setCorCel(String corCel) {
		this.corCel = corCel;
	}
	public String getModeloCel() {
		return modeloCel;
	}
	public void setModeloCel(String modeloCel) {
		this.modeloCel = modeloCel;
	}
	
}
