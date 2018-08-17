package br.edu.ifpi.ads3.pc.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteConexao {
	public static void main(String[] args) throws SQLException {
		Connection c = Database.getConnection();
		Statement stmt = c.createStatement();
		stmt.execute("select * from produto");
		ResultSet resultSet = stmt.getResultSet();
		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String nome = resultSet.getString("nome");
			String descricao = resultSet.getString("descricao");
			System.out.println("id " + id);
			System.out.println("Nome " + nome);
			System.out.println("Descricao " + descricao);
		}
		c.close();
	}
}
