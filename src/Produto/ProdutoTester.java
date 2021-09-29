package Produto;

public class ProdutoTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto produto = new Produto(1, "Lápis",2,9.77);
		System.out.println(produto);
		
		Produto produto2 = new Produto(2, "Borracha",5,1.5);
		System.out.println(produto2);
		
		Produto produto3 = new Produto();
		produto3.setProdutoId(3);
		produto3.setNomeProduto("Caneta");
		produto3.setQtdProduto(20);
		produto3.setPreco(0.5);
		System.out.println(produto3);
		
		Produto produto4 = new Produto();
		produto4.setProdutoId(4);
		produto4.setNomeProduto("Apontador");
		produto4.setQtdProduto(5);
		produto4.setPreco(5);
		System.out.println(produto4);
		
		Produto produto5 = new Produto();
		produto5.setProdutoId(5);
		produto5.setNomeProduto("Marca Texto");
		produto5.setQtdProduto(10);
		produto5.setPreco(1);
		System.out.println(produto5);
		
		Produto produto6 = new Produto();
		produto6.setProdutoId(6);
		produto6.setNomeProduto("Lapiseira");
		produto6.setQtdProduto(8);
		produto6.setPreco(4);
		System.out.println(produto6);
	}

}
