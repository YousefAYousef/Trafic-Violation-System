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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;

public class Payment {
    static int P_ID = 1;
    int Payment_ID = P_ID;
    double Payment_Price = 500;
    Date Payment_Date;

    public void makePayment()
    {
          DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");  
           LocalDateTime now = LocalDateTime.now();  
         try{
              String url = "jdbc:derby://localhost:1527/Traffic";
           Connection conn = DriverManager.getConnection(url, "ahmed", "ahmed");
           Statement st = conn.createStatement();
           st.executeUpdate("INSERT INTO PAYMENT VALUES("+Payment_ID + ", " + Payment_Price + ", '" + dtf.format(now) + "')");
           P_ID++;
           st.close();
           conn.close();
           
       }
       catch(SQLException ex)
       {
        //   JOptionPane.showMessageDialog(this, "Failed to connect to database");
       }
       
    }
  

    public double getPayment_Price() {
        return Payment_Price;
    }

    public void setPayment_Price(double Payment_Price) {
        this.Payment_Price = Payment_Price;
    }

    public Date getPayment_Date() {
        return Payment_Date;
    }

    public void setPayment_Date(Date Payment_Date) {
        this.Payment_Date = Payment_Date;
    }
    
    
    
}
