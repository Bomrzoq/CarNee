/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carnee;

/**
 *
 * @author Dobler
 */
//Class to hold the information of the Costumer
public class Customer {
    private int ID ; 
    private String Name ; 
    
    Customer (int id , String name) { ID=id; Name=name;   }
    Customer () {}
    
    public int getCustomerID() { return this.ID;}
    public void setCustomerID(int id) { ID=id;  } 
    
    public String getCustomerName() { return this.Name; }
    public void getCustomerID(String n) { Name = n;  } 
}
