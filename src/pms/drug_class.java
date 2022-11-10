/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pms;

/**
 *
 * @author moham
 */
public class drug_class {
    
    int id;
    String name;
    int quantity;
    int price;
    String exp_date;
    
    // Constractour 
    public drug_class(int ID , String NAME , int Quantity , int Price , String EXP_date)
    {
    this.id = ID;
    this.name = NAME;
    this.quantity = Quantity;
    this.price = Price;
    this.exp_date = EXP_date;
    }
    // Getter
    public int getId(){return id;}
    public String getName(){return name;}
    public int getQuantity(){return quantity;}
    public int getPrice(){return price;}
    public String getExpdate(){return exp_date;}
}
