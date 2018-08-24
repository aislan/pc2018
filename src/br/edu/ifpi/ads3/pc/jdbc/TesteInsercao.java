package br.edu.ifpi.ads3.pc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteInsercao {
	public static void main(String[] args) throws SQLException {
		Database database = new Database();
		try (Connection c = database.getConnection()){
			c.setAutoCommit(false);
			String sql = "insert into Produto (nome, descricao) values (?, ?)";
			
			try (PreparedStatement stmt = 
					c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
				adiciona("mouse", "laser", stmt);
				adiciona("mouse2", "laser2", stmt);
				c.commit();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
				c.rollback();
				System.out.println("Efetuei um rollback");
			}
		}
	}

	private static void adiciona(String nome, String descricao, PreparedStatement stmt) 
			throws SQLException {
		if (nome.equals("mouse2")) {
			throw new IllegalArgumentException("Problema ocorrido");
		}
		stmt.setString(1, nome);
		stmt.setString(2, descricao);
		stmt.execute();
		ResultSet r = stmt.getGeneratedKeys();
		while(r.next()) {
			int id = r.getInt("id");
			System.out.println("id " + id);
		}
	}


}
