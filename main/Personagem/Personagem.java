package Personagem;

public class Personagem {
	
	private String name;
	private int saude;
	private int forca;
	private int magia;
	
	
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
	public int getForca() {
		
		return forca;
	}
	public void setForca(int forca) {
		if(forca >=0) {
		this.forca = forca;
		}
	}
	public int getMagia() {
		return magia;
	}
	public void setMagia(int magia) {
		if(magia >=0) {
		this.magia = magia;
		}
	}

}
