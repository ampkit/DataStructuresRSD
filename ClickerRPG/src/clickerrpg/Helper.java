package clickerrpg;

//entity class
public class Helper implements Comparable<Helper> {

    private int id;
    private String name;
    private double damage;
    private double hireCost;
    private int level;
    private double levelUpCost;

    public Helper(int id, String name, double damage, double hireCost, int level, double levelUpCost) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.hireCost = hireCost;
        this.level = level;
        this.levelUpCost = levelUpCost;
    }

    public int getId() {
        return id;
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

    public double getLevelUpCost() {
        return levelUpCost;
    }

    public void setLevelUpCost(double levelUpCost) {
        this.levelUpCost = levelUpCost;
    }

    @Override
    public String toString() {
        return "Helper{" + "id=" + id + ", name=" + name + ", damage=" + damage + ", hireCost=" + hireCost + ", level=" + level + ", levelUpCost=" + levelUpCost + '}';
    }

}
