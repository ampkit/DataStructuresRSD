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
    
}
