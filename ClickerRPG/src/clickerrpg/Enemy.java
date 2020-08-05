package clickerrpg;

/**
 *
 * @author Chong Wai Kit
 */
public class Enemy {
    String name;
    
    double curHealth;
    double maxHealth;
    double attack;
    double defense;
    
    double goldDropped;

    public Enemy() {
         this.name = "testEnemy";

        this.curHealth = 100;
        this.maxHealth = 100;   
        
        this.attack = 10;
        this.defense = 1;
    }
}
