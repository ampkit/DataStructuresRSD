package clickerrpg;

// entity class
public class Enemy{
    private String name;
    private double curHealth;
    private double maxHealth;
    private double attack;
    private double defense;
    private double goldDropped;
    private int currentAttackPeriod;
    private int attackPeriod;
    //int currentAttackPeriod = 0;
   // int attackPeriod = 1000; //milliseconds

    public Enemy(String name, double curHealth, double maxHealth, double attack, double defense, double goldDropped, int currentAttackPeriod, int attackPeriod) {
        this.name = name;
        this.curHealth = curHealth;
        this.maxHealth = maxHealth;
        this.attack = attack;
        this.defense = defense;
        this.goldDropped = goldDropped;
        this.currentAttackPeriod = currentAttackPeriod;
        this.attackPeriod = attackPeriod;
    }

    
    //public Enemy() {
         //this.name = "testEnemy";

        //this.curHealth = 100;
        //this.maxHealth = 100;   
        
        //this.attack = 10;
        //this.defense = 1;
        
    //}

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

    public int getCurrentAttackPeriod() {
        return currentAttackPeriod;
    }

    public void setCurrentAttackPeriod(int currentAttackPeriod) {
        this.currentAttackPeriod = currentAttackPeriod;
    }

    public int getAttackPeriod() {
        return attackPeriod;
    }

    public void setAttackPeriod(int attackPeriod) {
        this.attackPeriod = attackPeriod;
    }

    
    
    @Override
    public String toString() {
        return "Enemy{" + "name=" + name + ", curHealth=" + curHealth + ", maxHealth=" + maxHealth + ", attack=" + attack + ", defense=" + defense + ", goldDropped=" + goldDropped + '}';
    }
    
 
}
