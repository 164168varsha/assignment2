package com.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.connection.exception.ShoppingCartProjectException;


public class ConnectionFactory {
		private static Connection connection ;

		public static Connection getConnection() {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
			} catch (SQLException | ClassNotFoundException e) {
				
				e.printStackTrace();
			
			} return connection;
			
		}
	

		public static void closeConnection() {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public static void main(String[] args) throws ShoppingCartProjectException {
			System.out.println(ConnectionFactory.getConnection());
		}
	}


