package br.com.ferro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/fj21?useSSL=false", "root", "mferro");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
