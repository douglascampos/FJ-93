
public class Cnpj {
	private String valor;
	
	public boolean ehValido() {
		return primeiroDigitoVerificador() == primeiroDigitoCorreto()
				&& segundoDigitoVerificador() == segundoDigitoCorreto();
	}
	
	private int segundoDigitoCorreto() {
		// TODO Implementar
		return 1;
	}

	private int segundoDigitoVerificador() {
		// TODO Implementar
		return 1;
	}

	private int primeiroDigitoCorreto() {
		// TODO Implementar
		return 2;
	}

	private int primeiroDigitoVerificador() {
		// TODO Implementar
		return 2;
	}

	public String getCnpjCredor() {
		return valor;
	}
	public void setCnpjCredor(String novoValor) {
		this.valor = novoValor;
	}

}
