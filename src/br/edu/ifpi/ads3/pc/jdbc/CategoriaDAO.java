package br.edu.ifpi.ads3.pc.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO {
	private Connection connection;
	public CategoriaDAO(Connection connection) {
		this.connection = connection;
	}
	public List<Produto> lista() throws SQLException {
		ArrayList<Produto> categorias = new ArrayList<>();
		try (Statement stmt = connection.createStatement()){
			stmt.execute("select * from categoria");
			try (ResultSet rs = stmt.getResultSet()){
				while (rs.next()) {
					int id = rs.getInt("id");
					String nome = rs.getString("nome");
					Categoria c = new Categoria(nome);
					c.setId(id);
					categorias.add(p);
				}
			}
		}
		return categorias;
	}
}
