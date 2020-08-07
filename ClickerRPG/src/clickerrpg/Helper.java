package clickerrpg;

//entity class
public class Helper implements Comparable<Helper> {

    private int id;
    private String name;
    private double damage;
    private double hireCost;
    private int level;
    private double levelUpCost;
    private String imageUrl;

    public Helper(int id, String name, double damage, double hireCost, int level, double levelUpCost, String imageUrl) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.hireCost = hireCost;
        this.level = level;
        this.levelUpCost = levelUpCost;
        this.imageUrl = imageUrl;
    }

    public Helper(int id) {
        switch (id) {
            case 1:
                setHelperDetails(1, "Helper1", 10, 100, 1, 50, ".png");
                break;
            case 2:
                setHelperDetails(2, "Helper2", 10, 100, 1, 50, ".png");
                break;
            case 3:
                setHelperDetails(3, "Helper3", 10, 100, 1, 50, ".png");
                break;
            case 4:
                setHelperDetails(4, "Helper4", 10, 100, 1, 50, ".png");
                break;
            case 5:
                setHelperDetails(5, "Helper5", 10, 100, 1, 50, ".png");
                break;
            case 6:
                setHelperDetails(6, "Helper6", 10, 100, 1, 50, ".png");
                break;
            case 7:
                setHelperDetails(7, "Helper7", 10, 100, 1, 50, ".png");
                break;
            case 8:
                setHelperDetails(8, "Helper8", 10, 100, 1, 50, ".png");
                break;
            case 9:
                setHelperDetails(9, "Helper9", 10, 100, 1, 50, ".png");
                break;
        }
    }

    public void setHelperDetails(int id, String name, double damage, double hireCost, int level, double levelUpCost, String imageUrl) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.hireCost = hireCost;
        this.level = level;
        this.levelUpCost = levelUpCost;
        this.imageUrl = imageUrl;
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
