/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficmonitoringsystem;

//enum Type{

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

  //  Car, MotorCycle, Truck
//}

public class Driver 
{
    String Driver_SSN;
    String Driver_Name;
    String Driver_Address;
    double Driver_Balance;
    Account Driver_Account;
    String Vehicle_Model;
    String Vehicle_Type;
    String Plate_Number;
    String License_ID;
    
    public Driver()
    {
        
    }
    
    public Driver(String m, String p)
    {
        Driver_Account.Mail = m;
        Driver_Account.Password = p;
    }

    public Driver getDriverObject(String platenumber)
    {
       String url = "jdbc:derby://localhost:1527/Traffic";
       Driver d = new Driver();
       try{
           Connection conn = DriverManager.getConnection(url, "ahmed", "ahmed");
           Statement st = conn.createStatement();
    
           ResultSet rs = st.executeQuery("SELECT * FROM DRIVER WHERE PLATE_NUMBER = '" + platenumber + "'");
           
           if(rs.next())
           {
            d.Driver_SSN = rs.getString("DRIVER_SSN");
            d.Driver_Name = rs.getString("DRIVER_NAME");
            d.Driver_Address = rs.getString("DRIVER_ADDRESS");
            d.Vehicle_Type = rs.getString("VEHICLE_TYPE");
            d.Vehicle_Model = rs.getString("VEHICLE_MODEL");
            d.Plate_Number = platenumber;
            d.Driver_Balance = rs.getDouble("DRIVER_BALANCE");
            d.License_ID = rs.getString("LICENSE_ID");
 
           }
           
           st.close();
           conn.close();
       }
       catch(SQLException ex)
       {
           
       }
       return d;
    }
    
    public String getDriver_SSN() {
        return Driver_SSN;
    }

    public void setDriver_SSN(String Driver_SSN) {
        this.Driver_SSN = Driver_SSN;
    }

    public String getDriver_Name() {
        return Driver_Name;
    }

    public void setDriver_Name(String Driver_Name) {
        this.Driver_Name = Driver_Name;
    }

    public String getDriver_Address() {
        return Driver_Address;
    }

    public void setDriver_Address(String Driver_Address) {
        this.Driver_Address = Driver_Address;
    }

    public double getDriver_Balance() {
        return Driver_Balance;
    }

    public void setDriver_Balance(double Driver_Balance) {
        this.Driver_Balance = Driver_Balance;
    }

    public String getVehicle_Model() {
        return Vehicle_Model;
    }

    public void setVehicle_Model(String Vehicle_Model) {
        this.Vehicle_Model = Vehicle_Model;
    }

    public String getVehicle_Type() {
        return Vehicle_Type;
    }

    public void setVehicle_Type(String Vehicle_Type) {
        this.Vehicle_Type = Vehicle_Type;
    }


    public String getPlate_Number() {
        return Plate_Number;
    }

    public void setPlate_Number(String Plate_Number) {
        this.Plate_Number = Plate_Number;
    }

    public String getLicense_ID() {
        return License_ID;
    }

    public void setLicense_ID(String License_ID) {
        this.License_ID = License_ID;
    }
    
    
    
}
