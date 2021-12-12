/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Manufacturer;

import java.util.ArrayList;

/**
 *
 * @author srushtidesai
 */
public class ItemDirectory { ArrayList<Item> itemList;
    Manufacturer manufacturer;

    public ItemDirectory(Manufacturer manufacturer) {
        itemList = new ArrayList();
        this.manufacturer =  manufacturer;
        
    }
    
    public Item addNewItem(String itemtype, String itemName, double price)
    {
        Item item = new Item(itemtype, itemName,  price);
        itemList.add(item);
        return item;
        
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Item> menuList) {
        this.itemList = itemList;
    }
    
    public void removeMenu(Item item)
    {
        itemList.remove(item);
    }
    
    
    
}

    

