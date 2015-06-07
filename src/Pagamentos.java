import java.util.ArrayList;


public class Pagamentos extends ArrayList<Pagamento>{
	
	private double valorPago;
	
	//	public ArrayList<Pagamento> pagamentosAntesDe(Calendar data) {
	//	ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
	//	
	//	for (Pagamento pagamento : this.pagamentos) {
	//		if (pagamento.getData().before(data)) {
	//			pagamentosFiltrados.add(pagamento);
	//		}
	//	}
	//	return pagamentosFiltrados;	
	//}
	
	public ArrayList<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		
		for (Pagamento pagamento : this) {
			if (pagamento.getValor() > valorMinimo) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}
	
	public ArrayList<Pagamento> pagamentosDo(String cnpjPagador) {
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		
		for (Pagamento pagamento : this) {
			if (pagamento.getCnpjPagador() == cnpjPagador) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}
	
	public ArrayList<Pagamento> getPagamentos() {
		return this;
	}
	
	public double getValorPago() {
		return valorPago;
	}
	
	// Metodo que cobra uma taxa bancaria para caso o valor seja maior do que R$100,00
	// Exrair os valores para constantes
	private void paga(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor de pagamento inválido");
		}
		
		if (valor > 100) {
			valor = valor - 8;
		}
		this.valorPago += valor;
	}
	
	public void registra(Pagamento pagamento) {
		this.add(pagamento);
		this.paga(pagamento.getValor());
	}

}
