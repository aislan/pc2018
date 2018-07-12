package br.edu.ifpi.ads3.pc;


public class Conta {
	private double saldo;
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	void saca (double valor) {
		if (this.saldo<valor) {
			throw new SaldoInsuficienteException("Você é liso!");
		} else {
			this.saldo -= valor;
		}
	}
}
