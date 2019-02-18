package course.capitulos.basicos.poo.entities;

public class Conta {

	private int numeroConta;
	private String titular;
	private double saldo;

	public Conta(int numeroConta, String titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
	}

	public Conta(int numeroConta, String titular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		depositar(depositoInicial);
	}

	public void depositar(double deposito) {
		this.saldo += deposito;
	}

	public void saque(double saque) {
		this.saldo -= saque + 5;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numeroConta;
	}

	public String toString() {
		return "Account " + getNumero() + ", Holder " + getTitular() + ", Balance: $" + getSaldo();
	}

}
