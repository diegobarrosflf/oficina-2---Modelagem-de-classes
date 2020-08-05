package Entidades;

public class Cliente {

	private int codigo;
	private String nome;
	private String cnpj;

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(int codigo, String nome, String cnpj) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cnpj = cnpj;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Código do cliente: " + codigo + ", Nome: " + nome + ", CNPJ: " + cnpj;
	}

}
