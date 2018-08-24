package br.edu.ifpi.ads3.pc.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProdutosDAO {
	private Connection connection;
	public ProdutosDAO(Connection connection) {
		this.connection = connection;
	}
	public void salva( Produto produto) throws SQLException {
		String sql = "insert into Produto (nome, descricao) values (?, ?)";
		try (PreparedStatement stmt = 
				connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
			stmt.setString(1, produto.nome);
			stmt.setString(2, produto.descricao);
			stmt.execute();
			ResultSet r = stmt.getGeneratedKeys();
			while(r.next()) {
				int id = r.getInt("id");
				System.out.println("id " + id);
			}
		
		}
	}
	public List<Produto> lista() throws SQLException {
		ArrayList<Produto> produtos = new ArrayList<>();
		try (Statement stmt = connection.createStatement()){
			stmt.execute("select * from produto");
			try (ResultSet rs = stmt.getResultSet()){
				while (rs.next()) {
					int id = rs.getInt("id");
					String nome = rs.getString("nome");
					String descricao = rs.getString("descricao");
					Produto p = new Produto(nome, descricao);
					p.setId(id);
					produtos.add(p);
				}
			}
		}
		return produtos;
	}
}
