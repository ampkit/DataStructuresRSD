/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clickerrpg;

/**
 *
 * @author User
 */
public class Upgrade {
    private int id ;
    private String name;
    private double attack;
    private double health;
    private double defense;
    private double cost;
    
    public Upgrade(String name,double attack, double health, double defense, double cost)
    {
        
        this.name = name;
        this.attack = attack;
        this.health = health;
        this.defense = defense;
        this.cost = cost;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
     public double getAttack()
    {
        return attack;
    }
    
    public void setAttack(double naattackme)
    {
        this.attack = attack;
    }
    
    public double getHealth()
    {
        return health;
    }
    
    public void setHealth(double health)
    {
        this.health = health;
    }
    
    public double getDefense()
    {
        return defense;
    }
    
    public void setDefense(double defense)
    {
        this.defense = defense;
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
