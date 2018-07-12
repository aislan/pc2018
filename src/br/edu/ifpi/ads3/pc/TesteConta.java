package br.edu.ifpi.ads3.pc;

public class TesteConta {
	public static void main(String[] args) {
		Conta c = new Conta();
		c.setSaldo(100);
		try {
			c.saca(200);	
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
