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
import javax.swing.JOptionPane;

public class TicketControl {
    public void AddnewTicket(String platenumber, String tickettype, String details, String ticketaddress)
    {
        Ticket s = new Ticket();
        Driver d = new Driver();
        d = d.getDriverObject(platenumber);
        s.Add_new_ticket(d, ticketaddress, tickettype, details, d.Driver_SSN);        
    }
    public Driver CheckDriver(String platenumber)
    {
        Driver d = new Driver();
        d = d.getDriverObject(platenumber);
        
        return d;
    }
    public void markTicketPaid(int tid)
    {
        Ticket t = new Ticket();
        t.markTicketPaid(tid);
    }
    
    public void makePayment()
    {
        Payment p = new Payment();
        p.makePayment();
    }
    
    public void payTicket(int tid)
    {
        markTicketPaid(tid);
        makePayment();
    }
    public void removeTicket(int tid)
    {
        Ticket t = new Ticket();
        t.RemoveTicket(tid);
    }
    
    public void EditTicket(int tid)
    {
        // 
    }
    
}
