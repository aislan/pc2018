package br.edu.ifpi.pc.lang;

public class Conta {
	private double saldo;
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String toString() {
		return  "Seu saldo é " + this.saldo;
	}
	@Override
	public boolean equals(Object obj) {
		Conta outraConta = (Conta) obj;
		return this.saldo == outraConta.getSaldo();
	}
}
