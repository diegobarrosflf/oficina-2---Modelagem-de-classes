package Entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NotaFiscal {

	private int codigo;
	private Date data;
	private Cliente cliente;
	private List<ItemNotaFiscal> itens = new ArrayList<ItemNotaFiscal>();

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public NotaFiscal() {
		super();
	}

	public NotaFiscal(int codigo, Date data, Cliente cliente) {
		super();
		this.codigo = codigo;
		this.data = data;
		this.cliente = cliente;
	}

	public void criarItemNotaFiscal(int item, int qte, Produto produto) {
		ItemNotaFiscal itemNotaFiscal = new ItemNotaFiscal(item, qte, produto);
		inserirItem(itemNotaFiscal);
	}

	public float calcularValor() {
		float valorNota = 0;
		for (ItemNotaFiscal itemNotaFiscal : itens) {
			valorNota = valorNota + itemNotaFiscal.valorItem();
		}

		return valorNota;
	}

	public void inserirItem(ItemNotaFiscal itemNotaFiscal) {
		itens.add(itemNotaFiscal);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemNotaFiscal> getItens() {
		return itens;
	}

	public void setItens(ArrayList<ItemNotaFiscal> itens) {
		this.itens = itens;
	}

	@Override
	public String toString() {
		return "Código da Nota Fiscal: " + codigo + ", Data: " + sdf.format(getData());
	}

	public String resumo() {
		String resumo = toString() + "\n";
		resumo = resumo + cliente.toString() + "\n";
		for (ItemNotaFiscal itemNotaFiscal : itens) {
			resumo = resumo + itemNotaFiscal.toString() + "\n";
		}

		resumo = resumo + "Valor da Nota Fiscal:" + calcularValor();

		return resumo;
	}
}
