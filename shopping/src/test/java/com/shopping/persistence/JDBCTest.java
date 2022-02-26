package com.shopping.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class JDBCTest {

	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDrive");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		
		try(Connection con =
				DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:orcl",
						"test",
						"1234")){
			System.out.println(con);
		}	catch (Exception e) {
			fail(e.getMessage());
		}
	}
}
