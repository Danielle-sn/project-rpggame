package Personagem.Inimigo;

public class Inimigo {
	
	public enum Tipo {
        ORC,
        DRAGAO,
        ESPIRITOS 
    }
	
	private Tipo tipoInimigo;

	public Tipo getTipoInimigo() {
		return tipoInimigo;
	}

	public void setTipoInimigo(Tipo tipoInimigo) {
		this.tipoInimigo = tipoInimigo;
	} 
 

}
