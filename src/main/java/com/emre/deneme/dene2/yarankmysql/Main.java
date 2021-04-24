package com.emre.deneme.dene2.yarankmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			// String conSstr =
			// "jdbc:mysql://localhost:3306/classicmodels?user=emre&password=emre&serverTimezone=UTC";
			String conSstr = "jdbc:mysql://localhost:3306/classicmodels?user=emre&password=emre";
			Connection conn = DriverManager.getConnection(conSstr); //// .d

			boolean success = conn.isValid(2);

			// success ? System.out.println("eved") : System.out.println("naayr"); // löl

			if (success) {
				System.out.println("eveed");
			} else {
				System.out.println("nayrobi");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("gule bule");
	}

}
