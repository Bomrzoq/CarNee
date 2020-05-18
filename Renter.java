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
public class Renter {
    private int ID ; 
    private String Name ; 
    
    Renter (int id , String name) { ID=id; Name=name;   }
    Renter () {}
    
    public int getRenterID() { return this.ID;}
    public void setRenterID(int id) { ID=id;  } 
    
    public String getRenterName() { return this.Name; }
    public void getRenterID(String n) { Name = n;  } 
}
