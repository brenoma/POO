
public class Teste {

	public static void main(String[] args) {
		Produto P1 = new Produto("Sabre de Luz", 10001, 79.99f);
		Produto P2 = new Produto("Controle PS4", 10002, 129.99f);
		Produto P3 = new Produto("Super Mario Toy Art - Koopa", 10003, 39.99f);
		
		Livro L1 = new Livro("A Maquina do Tempo", 20004, 44.90f, "H.G. Wells", "Martin Claret", 161, "Ficcao Cientifica");
		Livro L2 = new Livro("Sandman Vol. 1", 20005, 150.00f, "Neil Gaiman", "Vertigo", 368, "Quadrinhos");
		Livro L3 = new Livro("O Processo", 20006, 23.99f, "Franz Kafka", "Companhia de Bolso", 272, "Romance Distopico");
		
		Disco D1 = new Disco("Animals", 30007, 25.99f, "Pink Floyd", "Rock Progressivo", 5);
		Disco D2 = new Disco("Hunky Dory", 30008, 19.99f, "David Bowie", "Glam Rock", 11);
		Disco D3 = new Disco("Todos os Olhos", 30009, 22.40f, "Tom Ze", "MPB", 11);
		
		Loja Loja1 = new Loja(9);
		
		Loja1.CadastrarProduto(P1);
		Loja1.CadastrarProduto(P2);
		Loja1.CadastrarProduto(P3);
		Loja1.CadastrarProduto(L1);
		Loja1.CadastrarProduto(L2);
		Loja1.CadastrarProduto(L3);
		Loja1.CadastrarProduto(D1);
		Loja1.CadastrarProduto(D2);
		Loja1.CadastrarProduto(D3);
		//Loja1.ListarProdutos();
		//Loja1.BuscarProduto(30007);
		//Loja1.CadastrarPromocao(30007, 10f);
		//Loja1.BuscarProduto(30007);
		//Loja1.ListarLivros();
		//Loja1.ListarDiscos();
		Loja1.CadastrarProduto(D3);
	}

}
