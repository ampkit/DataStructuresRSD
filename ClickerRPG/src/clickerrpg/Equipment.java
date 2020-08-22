package clickerrpg;

import javax.swing.ImageIcon;

public class Equipment implements Comparable<Equipment> {

    private String eqName;
    private ImageIcon imageIcon;

    private String eqSlot;

    private boolean equipped;

    private double attack;
    private double health;
    private double defense;

    private double price;

    public Equipment(String eqName, String eqSlot, double attack, double health, double defense, double price) {
        this.eqName = eqName;
        this.eqSlot = eqSlot;
        this.attack = attack;
        this.health = health;
        this.defense = defense;
    }

    //create item based on name
    public Equipment(String eqName) {
        switch (eqName) {
// <editor-fold defaultstate="collapsed" desc="Weapons">
            case "Wooden Sword":
                setEquipmentAttributes("Wooden Sword", "Weapon", 30, 0, 0, 200);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Wooden_Sword.png"));
                break;
            case "Iron Sword":
                setEquipmentAttributes("Iron Sword", "Weapon", 100, 0, 0, 1000);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Iron_Sword.png"));
                break;
            case "Golden Sword":
                setEquipmentAttributes("Golden Sword", "Weapon", 400, 0, 0, 5000);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Golden_Sword.png"));
                break;
            case "Diamond Sword":
                setEquipmentAttributes("Diamond Sword", "Weapon", 800, 0, 0, 10000);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Diamond_Sword.png"));
                break;
            case "Enchanted Diamond Sword":
                setEquipmentAttributes("Enchanted Diamond Sword", "Weapon", 2000, 0, 0, 50000);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Enchanted_Diamond_Sword.png"));
                break;

// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="Helmets">
            case "Leather Helmet":
                setEquipmentAttributes("Leather Helmet", "Helmet", 0, 50, 3, 200);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Leather_Helmet.png"));
                break;
            case "Chainmail Helmet":
                setEquipmentAttributes("Chainmail Helmet", "Helmet", 0, 100, 5, 1000);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Chainmail_Helmet.png"));
                break;
            case "Iron Helmet":
                setEquipmentAttributes("Iron Helmet", "Helmet", 0, 300, 8, 5000);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Iron_Helmet.png"));
                break;
            case "Golden Helmet":
                setEquipmentAttributes("Golden Helmet", "Helmet", 0, 500, 15, 10000);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Golden_Helmet.png"));
                break;
            case "Diamond Helmet":
                setEquipmentAttributes("Diamond Helmet", "Helmet", 0, 1500, 20, 50000);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Diamond_Helmet.png"));
                break;
            case "Netherite Helmet":
                setEquipmentAttributes("Netherite Helmet", "Helmet", 0, 5000, 40, 100000);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Netherite_Helmet.png"));
                break;
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="Chests">
            case "Leather Chestplate":
                setEquipmentAttributes("Leather Chestplate", "Chest", 0, 50, 3, 200);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Leather_Chestplate.png"));
                break;
            case "Chainmail Chestplate":
                setEquipmentAttributes("Chainmail Chestplate", "Chest", 0, 100, 5, 1000);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Chainmail_Chestplate.png"));
                break;
            case "Iron Chestplate":
                setEquipmentAttributes("Iron Chestplate", "Chest", 0,  300, 8, 5000);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Iron_Chestplate.png"));
                break;
            case "Golden Chestplate":
                setEquipmentAttributes("Golden Chestplate", "Chest", 0, 500, 15, 10000);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Golden_Chestplate.png"));
                break;
            case "Diamond Chestplate":
                setEquipmentAttributes("Diamond Chestplate", "Chest", 0, 1500, 20, 50000);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Diamond_Chestplate.png"));
                break;
            case "Netherite Chestplate":
                setEquipmentAttributes("Netherite Chestplate", "Chest", 0, 5000, 40, 100000);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Netherite_Chestplate.png"));
                break;
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="Leggings">
            case "Leather Leggings":
                setEquipmentAttributes("Leather Leggings", "Leggings", 0, 50, 3, 200);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Leather_Leggings.png"));
                break;
            case "Chainmail Leggings":
                setEquipmentAttributes("Chainmail Leggings", "Leggings", 0, 100, 5, 1000);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Chainmail_Leggings.png"));
                break;
            case "Iron Leggings":
                setEquipmentAttributes("Iron Leggings", "Leggings", 0,  300, 8, 5000);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Iron_Leggings.png"));
                break;
            case "Golden Leggings":
                setEquipmentAttributes("Golden Leggings", "Leggings", 0, 500, 15, 10000);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Golden_Leggings.png"));
                break;
            case "Diamond Leggings":
                setEquipmentAttributes("Diamond Leggings", "Leggings", 0, 1500, 20, 50000);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Diamond_Leggings.png"));
                break;
            case "Netherite Leggings":
                setEquipmentAttributes("Netherite Leggings", "Leggings", 0, 5000, 40, 100000);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Netherite_Leggings.png"));
                break;
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="Boots">
            case "Leather Boots":
                setEquipmentAttributes("Leather Boots", "Boots", 0, 50, 3, 200);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Leather_Boots.png"));
                break;
            case "Chainmail Boots":
                setEquipmentAttributes("Chainmail Boots", "Boots", 0, 100, 5, 1000);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Chainmail_Boots.png"));
                break;
            case "Iron Boots":
                setEquipmentAttributes("Iron Boots", "Boots", 0,  300, 8, 5000);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Iron_Boots.png"));
                break;
            case "Golden Boots":
                setEquipmentAttributes("Golden Boots", "Boots", 0, 500, 15, 10000);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Golden_Boots.png"));
                break;
            case "Diamond Boots":
                setEquipmentAttributes("Diamond Boots", "Boots", 0, 1500, 20, 50000);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Diamond_Boots.png"));
                break;
            case "Netherite Boots":
                setEquipmentAttributes("Netherite Boots", "Boots", 0, 5000, 40, 100000);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Netherite_Boots.png"));
                break;
// </editor-fold>
            default:
                setEquipmentAttributes("Error", "Error", 0, 0, 0, 0);
                break;
        }
    }

    public void equip() {
        equipped = true;
    }

    public void unequip() {
        equipped = false;
    }

    private void setEquipmentAttributes(String eqName, String eqSlot, double attack, double health, double defense, double price) {
        this.eqName = eqName;
        this.eqSlot = eqSlot;
        this.attack = attack;
        this.health = health;
        this.defense = defense;
        this.price = price;

    }

    @Override
    public int compareTo(Equipment comparedEquipment) {
        //compare by equipped
        // equipped = return -1 
        if (this.equipped && !comparedEquipment.equipped) {
            return -1;
        } else if (!this.equipped && comparedEquipment.equipped) {
            return 1;
        }

        //compare by slot
        // Order : Weapon -> Helmet -> Chest -> Leggings -> Boots
        int thisSlotValue = 0;
        int comparedSlotValue = 0;
        ;
        switch (this.eqSlot) {
            case "Weapon":
                thisSlotValue = 1;
                break;
            case "Helmet":
                thisSlotValue = 2;
                break;
            case "Chest":
                thisSlotValue = 3;
                break;
            case "Leggings":
                thisSlotValue = 4;
                break;
            case "Boots":
                thisSlotValue = 5;
                break;
        }

        switch (comparedEquipment.eqSlot) {
            case "Weapon":
                comparedSlotValue = 1;
                break;
            case "Helmet":
                comparedSlotValue = 2;
                break;
            case "Chest":
                comparedSlotValue = 3;
                break;
            case "Leggings":
                comparedSlotValue = 4;
                break;
            case "Boots":
                comparedSlotValue = 5;
                break;
        }

        if ((thisSlotValue - comparedSlotValue) != 0) {
            return thisSlotValue - comparedSlotValue;
        }

        //compare by stats
        double thisEqStats = this.attack + this.defense + this.health;
        double comparedEqStats = comparedEquipment.attack + comparedEquipment.defense + comparedEquipment.health;
        double statDifference =  thisEqStats - comparedEqStats;
        if (statDifference != 0) {
            return (int) statDifference * -1;
        } //return negative stat difference as larger stats are sorted in front

        //compare by name
        return this.eqName.compareTo(comparedEquipment.eqName);
    }

    // <editor-fold defaultstate="collapsed" desc="Getter/Setter">
    public String getEqName() {
        return eqName;
    }

    public void setEqName(String eqName) {
        this.eqName = eqName;
    }

    public String getEqSlot() {
        return eqSlot;
    }

    public void setEqSlot(String eqSlot) {
        this.eqSlot = eqSlot;
    }

    public ImageIcon getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    public boolean isEquipped() {
        return equipped;
    }

    public void setEquipped(boolean equipped) {
        this.equipped = equipped;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    // </editor-fold>

}
