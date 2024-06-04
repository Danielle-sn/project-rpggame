package Item;

public class Item {
	
	 public enum Tipo {
	        ARMA,
	        POCAO,
	        ARMADURA
	    }
	 
	 /* enum - é uma palavra-chave usada para definir um tipo especial de classe que 
	  * representa um conjunto fixo de constantes (valores pré-definidos). 
	  * Um enum em Java é uma maneira conveniente de representar 
	  * um grupo de constantes relacionadas que não mudam ao longo do tempo.*/
	 
	 private Tipo tipoItem; // Atributo do tipo enum Tipo
	 
	public Tipo getTipoItem() {
		return tipoItem;
	}
	public void setTipoItem(Tipo tipoItem) {
		this.tipoItem = tipoItem;
	}

}
