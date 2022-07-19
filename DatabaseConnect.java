/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficmonitoringsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnect 
{
    
    public DatabaseConnect()
    {
         String url = "jdbc:derby://localhost:1527/Traffic";
       
       try{
           Connection conn = DriverManager.getConnection(url, "ahmed", "ahmed");
           Statement st = conn.createStatement();
    
           st.close();
           conn.close();
       }
       catch(SQLException ex)
       {
           
       }
    }
    
}
