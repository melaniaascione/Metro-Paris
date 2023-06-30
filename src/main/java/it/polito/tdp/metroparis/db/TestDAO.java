package it.polito.tdp.metroparis.db;

import java.sql.Connection;

public class TestDAO {

	public static void main(String[] args) {
		
		try {
			Connection connection = DBConnect.getConnection();
			connection.close();
			System.out.println("Connection Test PASSED");
			
			MetroDAO dao = new MetroDAO() ;
			
			System.out.println(dao.readFermate()) ;
			System.out.println(dao.readLinee()) ;
			//System.out.println(dao.trovaCollegate(null, null))

		} catch (Exception e) {
			throw new RuntimeException("Test FAILED", e);
		}
	}

}
