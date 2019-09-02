package com.sgic.jdbc.sample;

import java.sql.*;  



public class Db {
	Connection connection;
	
	Connection connectionDatabase(String url, String user, String password) {
		
		try {
			connection = DriverManager.getConnection(url, user, password);
				
				
			}catch (SQLException e) {
				
				e.printStackTrace();
			}
			return connection;
		}
		
	}
	
