/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author suada
 */
public class testDatabase {
    
    public void testData() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-health-system-database?useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Berlin","root","FB2_infoDB");
        PreparedStatement st = con.prepareStatement("insert into person (fname, adress) values(?,?) ");
        st.setString(1,"Loko");
        st.setString(2,"strasse");
        int a = st.executeUpdate();
        if(a<0){
            System.out.println("Row Update");
        }
        }
         public static void main(String args[]){
             new testDatabase();
         }
    }
    

