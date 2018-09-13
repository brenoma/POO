
public class Produto {
	private String nome;
	private int cod;
	private float preco;
	
	public Produto(String nome, int cod, float preco) {
		this.nome = nome;
		this.cod = cod;
		this.preco = preco;
	}
	

	public boolean equals(Produto a) {
		if(a==null) return false;
		if(this.nome==a.nome && this.cod==a.cod) {
			System.out.println("Produto já cadastrado!");
			return true;
		}else {
			return false;
		}
	}

	public String toString() {
		return "\nProduto\nNome: " + nome + ", Codigo: " + cod + ", Preco: " + preco;
	}

	public int getCod() {
		return cod;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float getPreco() {
		return preco;
	}
	
	
}
