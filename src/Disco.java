
public class Disco extends Produto {
	private String banda, estilo;
	private int numfaixas;

	public Disco(String nome, int cod, float preco, String banda, String estilo, int numfaixas) {
		super(nome, cod, preco);
		this.banda = banda;
		this.estilo = estilo;
		this.numfaixas = numfaixas;
	}

	public String toString() {
		return super.toString() + "\nCategoria --- Discos\nBanda: " + banda + ", Estilo: " + estilo + ", Numero de faixas: " + numfaixas;
	}
	
	
}
