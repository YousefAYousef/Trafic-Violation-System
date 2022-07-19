/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficmonitoringsystem;

public class Police  {
    
    String Police_SSN;
    String police_name;
    String Police_Address;
    Account Police_Account;
    
    
    public Police(String m, String p)
    {
        Police_Account.Mail = m;
        Police_Account.Password = p;
    }

    
    public String getPolice_SSN() {
        return Police_SSN;
    }

    public void setPolice_SSN(String Police_SSN) {
        this.Police_SSN = Police_SSN;
    }

    public String getPolice_name() {
        return police_name;
    }

    public void setPolice_name(String police_name) {
        this.police_name = police_name;
    }

    public String getPolice_Address() {
        return Police_Address;
    }

    public void setPolice_Address(String Police_Address) {
        this.Police_Address = Police_Address;
    }

    
    
    
}
