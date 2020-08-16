package clickerrpg;

//entity class
public class Helper implements Comparable<Helper> {

    private int id;
    private String name;
    private double damage;
    private double hireCost;
    private int level;
    private double upgradeCost;
    private String imageUrl;
    private boolean hired;
    private boolean assigned;
    
    private int currentAttackPeriod = 0;
    private int attackPeriod = 1000; //milliseconds

    public Helper(int id, String name, double damage, double hireCost, int level, double upgradeCost, String imageUrl) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.hireCost = hireCost;
        this.level = level;
        this.upgradeCost = upgradeCost;
        this.imageUrl = imageUrl;
        this.hired = false;
        this.assigned = false;
    }

    public int getId() {
        return id;
    }

    public void upgrade() {
        this.level++;
        this.upgradeCost *= 1.3;
        this.damage *= 1.3;
    }

    @Override
    public int compareTo(Helper anotherHelper) {
        if (this.getId() < anotherHelper.getId()) {
            return -1;
        } else if (this.getId() == anotherHelper.getId()) {
            return 0;
        } else {
            return 1;
        }
    }

    public void addCurrentAttackPeriod(int milSec){
        this.currentAttackPeriod += milSec;
    }
    
    @Override
    public String toString() {
        return "Helper{" + "id=" + id + ", name=" + name + ", damage=" + damage + ", hireCost=" + hireCost + ", level=" + level + ", levelUpCost=" + upgradeCost + '}';
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
