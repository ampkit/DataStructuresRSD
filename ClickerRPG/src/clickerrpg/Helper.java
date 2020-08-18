package clickerrpg;

//entity class
public class Helper implements Comparable<Helper> {

    private String name;
    private double damage;
    private double hireCost;
    private int level;
    private double upgradeCost;
    private String imageUrl;    //Image path of the helper
    private boolean hired;
    private boolean assigned;
    
    private int currentAttackPeriod = 0; //currentAttackPeriod indicates the current milliseconds passed. 
    private int attackPeriod = 1000;     //indicates how many milliseconds needed for the helper to perform his next attack.
                                         //When the currentAttackPeriod >= attackPeriod the helper performs an attack.
    
    public Helper(String name, double damage, double hireCost, int level, double upgradeCost, String imageUrl) {
        this.name = name;
        this.damage = damage;
        this.hireCost = hireCost;
        this.level = level;
        this.upgradeCost = upgradeCost;
        this.imageUrl = imageUrl;
        this.hired = false;
        this.assigned = false;
    }

    //Upgrade the helper which increase the level, damage and upgrade cost of the helper
    public void upgrade() {
        this.level++;
        this.upgradeCost *= 1.3;
        this.damage *= 1.3;
    }

    //Compare helper with another helper by hireCost.
    @Override
    public int compareTo(Helper anotherHelper) {
        if (this.hireCost < anotherHelper.getHireCost()) {
            return -1;
        } else if (this.hireCost == anotherHelper.getHireCost()) {
            return 0;
        } else {
            return 1;
        }
    }
    
    //Add current attack period value.
    public void addCurrentAttackPeriod(int milSec){
        this.currentAttackPeriod += milSec;
    }

    @Override
    public String toString() {
        return "Helper{" + "name=" + name + ", damage=" + damage + ", hireCost=" + hireCost + ", level=" + level + ", upgradeCost=" + upgradeCost + ", imageUrl=" + imageUrl + ", hired=" + hired + ", assigned=" + assigned + ", currentAttackPeriod=" + currentAttackPeriod + ", attackPeriod=" + attackPeriod + '}';
    }

    //setter, getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getHireCost() {
        return hireCost;
    }

    public void setHireCost(double hireCost) {
        this.hireCost = hireCost;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getUpgradeCost() {
        return upgradeCost;
    }

    public void setUpgradeCost(double levelUpCost) {
        this.upgradeCost = levelUpCost;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isHired() {
        return hired;
    }

    public void setHired(boolean hired) {
        this.hired = hired;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
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


}
