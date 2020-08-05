package Entidades;

public class ItemNotaFiscal {
	private int item;
	private int quantidade;
	private Produto produto;
	
	public ItemNotaFiscal() {
		super();
	}
	public ItemNotaFiscal(int item, int quantidade, Produto produto) {
		super();
		this.item = item;
		this.quantidade = quantidade;
		this.produto = produto;
	}
	
	public float valorItem() {
		return getQuantidade()*getProduto().getValor();
	}
	
	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	@Override
	public String toString() {
		return "Item: " + item + ", Produto: " + produto + ", Quantidade: " + quantidade ;
	}
	
	

}
