
public class Loja {
	private Produto prod[];
	private int cont = 0;
	
	public Loja(int tam) {
		this.prod = new Produto[tam];
	}
	
	public void CadastrarProduto (Produto p) {
		for(int i = 0 ; i < prod.length ; i++) {
			if(p.equals(prod[i])) {
				break;
			}else {
				this.prod[cont] = p;
				cont++;
			}
		}
	}
	
	public void ListarProdutos () {
		for(int i = 0; i < prod.length ; i++)
		System.out.println(prod[i].toString());
	}
	
	public void BuscarProduto (int codigo) {
		for(int i = 0 ; i < prod.length ; i++) {
			if(prod[i].getCod()==codigo) {
				System.out.println(prod[i].toString());
				break;
			}
		}
	}
	
	public void ListarLivros () {
		System.out.println("\n\n-----  LISTANDO LIVROS!  ------\n");
		for(int i = 0 ; i < prod.length ; i++) {
			if(prod[i] instanceof Livro) {
				System.out.println(prod[i].toString());
			}
		}
	}
	
	public void ListarDiscos () {
		System.out.println("\n\n-----  LISTANDO DISCOS!  ------\n");
		for(int i = 0 ; i < prod.length ; i++) {
			if(prod[i] instanceof Disco) {
				System.out.println(prod[i].toString());
			}
		}
	}
	
	public void CadastrarPromocao (int codigo, float desconto) {
		desconto = (100-desconto)/100;
		for(int i = 0 ; i < prod.length ; i++) {
			if(prod[i].getCod()==codigo) {
				prod[i].setPreco((desconto*prod[i].getPreco()));
			}
		}
	}
}
