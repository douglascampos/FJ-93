import java.util.ArrayList;


public class Divida {
	private double total;
	private double valorPago;
	private String credor;
	private String cnpjCredor;
	private ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
	
	public ArrayList<Pagamento> getPagamentos() {
		return pagamentos;
	}
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getValorPago() {
		return valorPago;
	}

	public String getCredor() {
		return credor;
	}
	public void setCredor(String credor) {
		this.credor = credor;
	}
	public String getCnpjCredor() {
		return cnpjCredor;
	}
	public void setCnpjCredor(String cnpjCredor) {
		this.cnpjCredor = cnpjCredor;
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
		this.pagamentos.add(pagamento);
		this.paga(pagamento.getValor());
	}
}