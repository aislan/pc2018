package br.edu.ifpi.ads3.pc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.sql.DataSource;

import org.hsqldb.jdbc.JDBCPool;

public class Database {
	private DataSource dataSource;
	public Database() {
		JDBCPool pool = new JDBCPool();
		pool.setUrl("jdbc:hsqldb:hsql://localhost/loja-virtual");
		pool.setUser("SA");
		pool.setPassword("");
		this.dataSource = pool;
	}
	Connection getConnection() throws SQLException {
		Connection c = dataSource.getConnection();
		return c;
	}
}
