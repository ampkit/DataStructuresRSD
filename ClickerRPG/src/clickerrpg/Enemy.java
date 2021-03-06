package clickerrpg;

// entity class
public class Enemy {

    private String name;
    private double curHealth;
    private double maxHealth;
    private double attack;
    private double defense;
    private double goldDropped;
    private int currentAttackPeriod;
    private int attackPeriod;
    private String imageIcon;

    public Enemy(String name, double maxHealth, double attack, double defense, double goldDropped, int attackPeriod, String imageIcon) {
        this.name = name;
        this.curHealth = maxHealth;
        this.maxHealth = maxHealth;
        this.attack = attack;
        this.defense = defense;
        this.goldDropped = goldDropped;
        this.currentAttackPeriod = 0;
        this.attackPeriod = attackPeriod;
        this.imageIcon = imageIcon;
    }

    // increase the stats of the enemy
    public void increaseStats(int stage) {
        this.attack *= (1 + (stage / 8.0));
        this.defense *= (1 + (stage / 50.0));
        this.maxHealth *= (1 + (stage / 10.0));
        this.goldDropped *= (1 + (stage / 30.0));
        if (stage < 100) {
            this.attackPeriod *= (1 - (stage / 150.0));
        } else {
            this.attackPeriod *= (1 - (100 / 150.0) - (stage / 999.9));
        }
        this.curHealth = maxHealth;
    }

    //add current attack period value
    public void addCurrentAttackPeriod(int milSec) {
        currentAttackPeriod += milSec;
    }

    // getter & setter
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

    public String getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(String imageIcon) {
        this.imageIcon = imageIcon;
    }

    @Override
    public String toString() {
        return "Enemy{" + "name=" + name + ", curHealth=" + curHealth + ", maxHealth=" + maxHealth + ", attack=" + attack + ", defense=" + defense + ", goldDropped=" + goldDropped + ", currentAttackPeriod=" + currentAttackPeriod + ", attackPeriod=" + attackPeriod + ", imageIcon=" + imageIcon + '}';
    }

}
