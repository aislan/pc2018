package br.edu.ifpi.ads3.pc.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteListaTodos {
	public static void main(String[] args) throws SQLException {
		Database d = new Database();
		try (Connection c = d.getConnection()){
			ProdutosDAO pd = new ProdutosDAO(c);
			for (Produto p : pd.lista()) {
				System.out.println(p);
			}
		}
		
	}
}
