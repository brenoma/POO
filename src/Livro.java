
public class Livro extends Produto {
	private String autor, editora, genero;
	private int numpag;

	public Livro(String nome, int cod, float preco, String autor, String editora, int numpag, String genero) {
		super(nome, cod, preco);
		this.autor = autor;
		this.editora = editora;
		this.numpag = numpag;
		this.genero = genero;
	}

	public String toString() {
		return super.toString() + "\nCategoria --- Livros\nAutor: " + autor + ", Editora: " + editora + ", Numero de Paginas: " + numpag + ", Genero: " + genero;
	}
	
	
}
