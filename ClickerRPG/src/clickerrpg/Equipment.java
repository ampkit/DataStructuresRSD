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
                setEquipmentAttributes("Wooden Sword", "Weapon", 1, 0, 0, 5);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Wooden_Sword.png"));
                break;
            case "Iron Sword":
                setEquipmentAttributes("Tin Sword", "Weapon", 2, 0, 0, 10);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Tin_Sword.png"));
                break;

// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="Helmets">
            case "Leather Helmet":
                setEquipmentAttributes("Leather Helmet", "Helmet", 0, 10, 1, 5);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Leather_Helmet.png"));
                break;
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="Chests">
            case "Leather Chestplate":
                setEquipmentAttributes("Leather Chestplate", "Chest", 0, 10, 1, 5);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Leather_Chestplate.png"));
                break;
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="Leggings">
            case "Leather Leggings":
                setEquipmentAttributes("Leather Leggings", "Leggings", 0, 10, 1, 5);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Leather_Leggings.png"));
                break;
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="Boots">
            case "Leather Boots":
                setEquipmentAttributes("Leather Boots", "Boots", 0, 10, 1, 5);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Leather_Boots.png"));
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
        double statDifference = this.attack + this.defense + this.health - comparedEquipment.attack - comparedEquipment.defense - comparedEquipment.health;
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
