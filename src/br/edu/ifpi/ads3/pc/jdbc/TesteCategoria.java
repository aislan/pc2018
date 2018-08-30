package br.edu.ifpi.ads3.pc.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteCategoria {
	public static void main(String[] args) throws SQLException {
		Database database = new Database();
		try (Connection c = database.getConnection()){
			CategoriaDAO cdao = new CategoriaDAO(c);
			for (Categoria categoria : cdao.lista()) {
				System.out.println(categoria.nome);
			}
		}
		
	}
}
