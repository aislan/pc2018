package br.edu.ifpi.ads3.pc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteInsercao {
	public static void main(String[] args) throws SQLException {
		Connection c = DriverManager.getConnection("jdbc:hsqldb:hsql://"
				+ "localhost/loja-virtual", "SA", "");
		Statement stmt = c.createStatement();
		boolean resultado = stmt.execute("insert into Produto (nome, descricao) values "
				+ "('Notebook', 'MacBook')");
		System.out.println(resultado);
		stmt.close();
		c.close();
	}
}
