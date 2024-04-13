package com.proj.employee;
//import java.sql.Connection;
public class DBConnection {

	
	public static void main(String [] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	//		Connection con=DriverManager.getConnection(null);
		}
       catch(ClassNotFoundException e1) {
    	   e1.printStackTrace();
       }
	}
	
	}

