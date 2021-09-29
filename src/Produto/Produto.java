package Produto;

public class Produto {
	//Declarações de campo de instância 
	private int produtoId;
	private String nomeProduto;
	private int qtdProduto;
	private double preco;
	
	//Construtor sem parâmetros
	public Produto () {
	}
	//Construtor com parâmetros
	public Produto (int produtoId, String nomeProduto, int qtdProduto, double preco) {
		this.produtoId = produtoId;
		this.nomeProduto = nomeProduto;
		this.qtdProduto = qtdProduto;
		this.preco = preco;
	}
	
	// getter produtoId
	public int getProdutoId () {
		return produtoId;
	}
	// setter produtoId
	public void setProdutoId (int x) {
		produtoId = x;
	}
	
	// getter nomeProduto
	public String getNomeProduto () {
		return nomeProduto;
	}
	// setter nomeProduto
	public void setNomeProduto (String x) {
		nomeProduto = x;
	}
	
	// getter qtdProduto
	public int getQtdProduto () {
		return qtdProduto;
	}
	// setter qtdProduto
	public void setQtdProduto (int x) {
		qtdProduto = x;
	}
	
	// getter preco
	public double getPreco () {
		return preco;
	}
	
	// setter preco
	public void setPreco (double x) {
		preco = x;
	}
	
	public String toString() {
		String produto = "";
		
		produto = "Id do produto:" + getProdutoId()
		+ "\nNome:" + getNomeProduto()
		+ "\nQuantidade:" + getQtdProduto()
		+ "\nPreço:" + getPreco();
		
		return produto;
	}
}
