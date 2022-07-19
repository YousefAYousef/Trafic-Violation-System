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

/**
 *
 * @author modyr
 */
public class Ticket {
    static int Tid = 50;
    int Ticket_ID = Tid;
    Date TicketDate;
    String Ticket_Address;
    String Ticket_Type;
    boolean Ticket_Status;
    String Ticket_Details;
    Driver Driver_info;

    public void markTicketPaid(int tid)
    {   
           String url = "jdbc:derby://localhost:1527/Traffic";
        // insert into drivr values(d.drivername, d.license, ticketID, getDate());
        try{
           Connection conn = DriverManager.getConnection(url, "ahmed", "ahmed");
           Statement st = conn.createStatement();
           
           String sql = "UPDATE TICKET SET TICKET_STATUS = " + false +  " WHERE TICKET_ID = "
                   + tid;
           
           st.executeUpdate(sql);
           st.close();
           conn.close();
       }
       catch(SQLException ex)
       {
           
       }
    }
    
    public void RemoveTicket(int ticketID)
    {
         String url = "jdbc:derby://localhost:1527/Traffic";
        // insert into drivr values(d.drivername, d.license, ticketID, getDate());
        try{
           Connection conn = DriverManager.getConnection(url, "ahmed", "ahmed");
           Statement st = conn.createStatement();
           String sql = "DELETE FROM TICKET WHERE TICKET_ID = " + ticketID;
           st.executeUpdate(sql);
           st.close();
           conn.close();
       }
       catch(SQLException ex)
       {
           
       }
    }
    
    public void Add_new_ticket(Driver d, String ticketAddress, String TicketType, String TicketDetails, String dssn)
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        String url = "jdbc:derby://localhost:1527/Traffic";
        // insert into drivr values(d.drivername, d.license, ticketID, getDate());
        try{
           Connection conn = DriverManager.getConnection(url, "ahmed", "ahmed");
           Statement st = conn.createStatement();
           st.executeUpdate("INSERT INTO TICKET VALUES("+ Ticket_ID +", '"+ dtf.format(now) + "', '" + ticketAddress + "', '" + TicketType + "', " + "true" + ", '" + TicketDetails  + "', '" + dssn + "')");     
      
           st.close();
           conn.close();
       }
       catch(SQLException ex)
       {
           
       }
        
        Tid++;
    }
    

    public Date getTicketDate() {
        return TicketDate;
    }

    public void setTicketDate(Date TicketDate) {
        this.TicketDate = TicketDate;
    }

    public String getTicket_Address() {
        return Ticket_Address;
    }

    public void setTicket_Address(String Ticket_Address) {
        this.Ticket_Address = Ticket_Address;
    }

    public String getTicket_Type() {
        return Ticket_Type;
    }

    public void setTicket_Type(String Ticket_Type) {
        this.Ticket_Type = Ticket_Type;
    }

    public boolean isTicket_Status() {
        return Ticket_Status;
    }

    public void setTicket_Status(boolean Ticket_Status) {
        this.Ticket_Status = Ticket_Status;
    }

    public String getTicket_Details() {
        return Ticket_Details;
    }

    public void setTicket_Details(String Ticket_Details) {
        this.Ticket_Details = Ticket_Details;
    }
    
    
    
    
}
