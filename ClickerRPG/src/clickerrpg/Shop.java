/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clickerrpg;


public class Shop {
    private String itemType;
    private String itemName;
    private int id;
    private double cost;
    
    public Shop(String type, String name, int id, double cost)
    {
        this.itemType = type;
        this.itemName = name;
        this.id = id;
        this.cost = cost;
    }
    
    public String getType()
    {
        return itemType;
    }
    
    public void setType(String type)
    {
        this.itemType= type;
    }
    
    public String getName()
    {
        return itemName;
    }
    
    public void setName(String name)
    {
        this.itemName = name;
    }
    
    public int getId()
    {
        return id;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public double getCost()
    {
        return cost;
    }
    
    public void setCost(double cost)
    {
        this.cost = cost;
    }
}
