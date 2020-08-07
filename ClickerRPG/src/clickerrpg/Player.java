package clickerrpg;

/**
 *
 * @author Chong Wai Kit
 */
public class Player {
    String name;
    
    double curHealth;
    double maxHealth;
    double attack;
    double defense;
    
    String helmet;
    String chest;
    
    double gold;
    
    public Player() {
        this.name = "testPlayer";
        
        this.curHealth = 100;
        this.maxHealth = 100;
        
        this.attack = 10;
        this.defense = 1;
        
        this.gold = 0;
    }
    
    //add function for increase gold

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCurHealth() {
        return curHealth;
    }

    public void setCurHealth(double curHealth) {
        this.curHealth = curHealth;
    }

    public double getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(double maxHealth) {
        this.maxHealth = maxHealth;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public double getGold() {
        return gold;
    }

    public void setGold(double gold) {
        this.gold = gold;
    }
    
}
