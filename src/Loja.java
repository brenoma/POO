import java.util.ArrayList;

public class Loja {
	private ArrayList<Produto> prod;
	private int cont = 0;
	
	public Loja(int tam) {
		ArrayList<Produto> prod = new ArrayList(tam);
	}
	
	public void CadastrarProduto (Produto p) {
		for(int i = 0 ; i < prod.size() ; i++) {
			if(p.equals(prod.get(i))) {
				break;
			}else {
				prod.add(p);
				cont++;
			}
		}
	}
	
	public void ListarProdutos () {
		for(int i = 0; i < prod.size() ; i++)
		System.out.println(prod.get(i).toString());
	}
	
	public void BuscarProduto (int codigo) {
		for(int i = 0 ; i < prod.size() ; i++) {
			if(prod.get(i).getCod()==codigo) {
				System.out.println(prod.get(i).toString());
				break;
			}
		}
	}
	
	public void ListarLivros () {
		System.out.println("\n\n-----  LISTANDO LIVROS!  ------\n");
		for(int i = 0 ; i < prod.size() ; i++) {
			if(prod.get(i) instanceof Livro) {
				System.out.println(prod.get(i).toString());
			}
		}
	}
	
	public void ListarDiscos () {
		System.out.println("\n\n-----  LISTANDO DISCOS!  ------\n");
		for(int i = 0 ; i < prod.size() ; i++) {
			if(prod.get(i) instanceof Disco) {
				System.out.println(prod.get(i).toString());
			}
		}
	}
	
	public void CadastrarPromocao (int codigo, float desconto) {
		desconto = (100-desconto)/100;
		for(int i = 0 ; i < prod.size() ; i++) {
			if(prod.get(i).getCod()==codigo) {
				prod.get(i).setPreco((desconto*prod.get(i).getPreco()));
			}
		}
	}
}
