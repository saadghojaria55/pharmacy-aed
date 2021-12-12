/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Manufacturer;

/**
 *
 * @author srushtidesai
 */
public class Item {  private String itemtype;
    private String itemName;
  
    private double price;
    private int quantity;

    public Item(String itemtype, String itemName, double price) {
        this.itemtype = itemtype;
        this.itemName = itemName;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
    
    public String getItemtype() {
        return itemtype;
    }

    public void setItemtype(String itemtype) {
        this.itemtype = itemtype;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

   

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString()
    {
        return itemName;
    }
}

    

