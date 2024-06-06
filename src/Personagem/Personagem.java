package Personagem;

public class Personagem {
	
	private String name;
	private int saude;
	private int nivel;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSaude() {
		return saude;
	}
	public void setSaude(int saude) {
		if(saude >=0) {
		this.saude = saude;
		}
	}
	public String getNivel() {
		return name;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
	

}
