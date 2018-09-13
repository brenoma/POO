
public class Produto {
	private String nome;
	private int cod;
	private float preco;
	
	public Produto(String nome, int cod, float preco) {
		this.nome = nome;
		this.cod = cod;
		this.preco = preco;
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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cod;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (this.cod != other.cod)
			return false;
		if (this.nome == null) {
			if (other.nome != null)
				return false;
		} else if (!this.nome.equals(other.nome))
			return false;
		return true;
	}
	
	
}
