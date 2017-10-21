package CajeroUdec;

public class Retiro {
	private int valor;
	private int saldo;
	

	public Retiro(int valor, int saldo) {
		super();
		this.valor = valor;
		this.saldo = saldo;
	}
	
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Retiro->" + " Valor:" + valor
				+ " Saldo:" + saldo + "\n";
	}

}
