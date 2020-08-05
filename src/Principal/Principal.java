package Principal;

import java.util.Date;

import Entidades.Cliente;
import Entidades.NotaFiscal;
import Entidades.Produto;

public class Principal {

	public static void main(String[] args) {

		Cliente cliente = new Cliente(100, "Lanchonete Salgado e Cia", "200.200.0002/20");

		Produto milho = new Produto(110, "Milho", 4.00f);
		Produto arroz = new Produto(220, "Arroz", 5.00f);
		Produto soja = new Produto(330, "Soja", 3.00f);

		NotaFiscal notaFiscal = new NotaFiscal(1, new Date(), cliente);

		notaFiscal.criarItemNotaFiscal(1, 10, milho);
		notaFiscal.criarItemNotaFiscal(2, 20, arroz);

		System.out.println(notaFiscal.resumo());

	}

}
