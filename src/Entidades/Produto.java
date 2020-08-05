package Entidades;

public class Produto {
	private int codigo;
	private String descricao;
	private float valor;

	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produto(int codigo, String descricao, float valor) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Código do produto: " + codigo + ", Descricao: " + descricao + ", Valor: " + valor;
	}

}
