package br.edu.ifpi.ads3.pc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	static Connection getConnection() throws SQLException {
		Connection c = DriverManager.getConnection("jdbc:hsqldb:hsql://"
				+ "localhost/loja-virtual", "SA", "");
		return c;
	}
}
