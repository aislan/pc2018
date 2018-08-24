package br.edu.ifpi.ads3.pc.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteInsercao2 {
	public static void main(String[] args) throws SQLException {
		Database database = new Database();
		try (Connection c = database.getConnection()){
			Produto mesa = new Produto("Mesa", "Mesa de quatro pernas");
			Produto cadeira = new Produto("cadeira","cadeira escritório");
			ProdutosDAO bp = new ProdutosDAO(c);
			bp.salva(mesa); 
			bp.salva(cadeira);
		}
	}
	
}
