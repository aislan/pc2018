package br.edu.ifpi.ads3.pc.jdbc;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteDelecao {
	public static void main(String[] args) throws SQLException {
		Database database = new Database();
		Connection c = database.getConnection();
		Statement stmt = c.createStatement();
		stmt.executeQuery("delete from produto where id >3 ");
		int count = stmt.getUpdateCount();
		System.out.println("Forma deletádos " + count + " linhas");
		stmt.close();
		c.close();
	}
}
