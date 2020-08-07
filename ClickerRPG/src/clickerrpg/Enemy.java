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

    public double getGoldDropped() {
        return goldDropped;
    }

    public void setGoldDropped(double goldDropped) {
        this.goldDropped = goldDropped;
    }
}
