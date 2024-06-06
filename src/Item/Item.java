package Item;


public class Item {

	 private String nome;
	 private String descricao;
	 private String tipo;
	
	
	 public Item(String nome,String descricao, String tipo){

		this.nome = nome;
		this.descricao = descricao;
		this.tipo = tipo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	

}
