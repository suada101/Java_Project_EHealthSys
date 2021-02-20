/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import java.sql.*;
 

	public class DataSavedIntoDatabase {

		public static void main(String[] args) {
			
		String url = "jdbc:mysql://localhost:3306/e-health-system-database?useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/";
	        String user = "root";
	        String password = "FB2_infoDB";
	 
	        try (Connection conn = DriverManager.getConnection(url, user, password)) {
	        	
	        	System.out.println("Erfolgreich mit Datenbank verbunden.");
	        	
	        	// Einfügen/ Verändern
	        	//String query = "INSERT INTO personen (vorname, nachname, geburtsdatum) VALUES ('Vin', 'Diesel', '1968-04-18')";
	        	String query = "UPDATE person SET password='password2' WHERE person_id=3";
	        	
	        	Statement stmt = conn.createStatement();
	        	stmt.execute(query);
	        	stmt.close();
	        	
	        	
	        	//------------------------------------------------------------------------------------------------
	        	// ausgeben
	        	query = "SELECT * FROM person ORDER BY person_id ASC";
	        	stmt = conn.createStatement();
	        	ResultSet rs = stmt.executeQuery(query);
	        	
	        	int columns = rs.getMetaData().getColumnCount();
	        	for(int i = 1; i<=columns; i++)
	        		System.out.print(String.format("%-20s", rs.getMetaData().getColumnLabel(i)));
	        	
	        	System.out.println();
	        	System.out.println("------------------------------------------------------------------");
	        	
	        	while(rs.next()) {
	        		for(int i = 1; i<=columns; i++)
	        			System.out.print(String.format("%-20s", rs.getString(i)));
	        		System.out.println();
	        	}
	        	
	        	rs.close();
	        	stmt.close();
	        	
	        	
	        }catch(SQLException ex) {
	        	
	        	System.err.println(ex.getMessage());
	        }
	        

		}

	}
/**
 *
 * @author suada
 */