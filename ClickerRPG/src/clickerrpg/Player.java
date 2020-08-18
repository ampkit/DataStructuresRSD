package clickerrpg;


import java.util.Objects;
import javax.swing.ImageIcon;

public class Player {

    private ImageIcon playerIcon;
    private String playerName;
    private int highscore;

    private double baseHealth;
    private double curHealth;
    private double maxHealth;
    private double baseAttack;
    private double attack;
    private double baseDefense;
    private double defense;
    private double goldMultiplier;

    private Equipment helmet;
    private Equipment chest;
    private Equipment leggings;
    private Equipment boots;
    private Equipment weapon;

    double gold;
    

    public Player() {
        this.playerIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/player150x90.png"));
        this.playerName = "testPlayer";

        this.curHealth = 100;
        this.maxHealth = 100;

        this.attack = 10;
        this.defense = 1;

        this.gold = 0;
        this.highscore = 1;
    }

    public Player(String playerName, int highscore) {
        this.playerIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/player150x90.png"));
        this.playerName = playerName;
        this.highscore = highscore;
        this.curHealth = 100;
        this.maxHealth = 100;

        this.attack = 10;
        this.defense = 1;

        this.gold = 0;
    }

    public Player(String playerName, double curHealth, double maxHealth, double attack, double defense, Equipment helmet, Equipment chest, Equipment leggings, Equipment boots, Equipment weapon, double gold, double goldMultiplier) {
        this.playerName = playerName;
        this.curHealth = curHealth;
        this.maxHealth = maxHealth;
        this.attack = attack;
        this.defense = defense;
        this.helmet = helmet;
        this.chest = chest;
        this.leggings = leggings;
        this.boots = boots;
        this.weapon = weapon;
        this.gold = gold;
        this.goldMultiplier = 1;
    }

    @Override
    public String toString() {
        return "Player{" + "playerName=" + playerName + ", highscore=" + highscore + ", curHealth=" + curHealth + ", maxHealth=" + maxHealth + ", attack=" + attack + ", defense=" + defense + ", goldMultiplier=" + goldMultiplier + ", helmet=" + helmet + ", chest=" + chest + ", leggings=" + leggings + ", boots=" + boots + ", weapon=" + weapon + ", gold=" + gold + '}';
    }

    
    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.playerName, other.playerName)) {
            return false;
        }
        return true;
    }

    //returns unequippedItem, if any
    public Equipment equipEquipment(Equipment equipment) {
        Equipment unequippedItem = null;
        switch (equipment.getEqSlot()) {
            case "Helmet":
                if (helmet != null) {
                    helmet.unequip();
                    unequippedItem = helmet;
                }
                equipment.equip();
                helmet = equipment;
                break;
            case "Chest":
                if (chest != null) {
                    chest.unequip();
                    unequippedItem = chest;

                }
                equipment.equip();
                chest = equipment;
                break;
            case "Leggings":
                if (leggings != null) {
                    leggings.unequip();
                    unequippedItem = leggings;

                }
                equipment.equip();
                helmet = equipment;
                break;
            case "Boots":
                if (boots != null) {
                    boots.unequip();
                    unequippedItem = boots;

                }
                equipment.equip();
                boots = equipment;
                break;
            case "Weapon":
                if (weapon != null) {
                    weapon.unequip();
                    unequippedItem = weapon;

                }
                equipment.equip();
                weapon = equipment;
                break;
        }

        return unequippedItem;
    }

    public void unequipEquipment(Equipment equipment) {
        switch (equipment.getEqSlot()) {
            case "Helmet":
                if (helmet != null) {
                    helmet.unequip();
                    equipment.unequip();
                    helmet = null;
                }
                break;
            case "Chest":
                if (chest != null) {
                    chest.unequip();
                    equipment.unequip();
                    chest = null;
                }
                break;
            case "Leggings":
                if (leggings != null) {
                    leggings.unequip();
                    equipment.unequip();
                    leggings = null;
                }
                break;
            case "Boots":
                if (boots != null) {
                    boots.unequip();
                    equipment.unequip();
                    boots = null;
                }
                break;
            case "Weapon":
                if (weapon != null) {
                    weapon.unequip();
                    equipment.unequip();
                    weapon = null;
                }
                break;
        }
    }

    public void heal(double amount) {
        curHealth += amount;
        if (curHealth > maxHealth) {
            curHealth = maxHealth;
        }
    }

    public void takeDamage(double amount) {
        curHealth -= amount;
    }

    public void addGold(double increase) {
        this.gold += increase;
    }

    public void deductGold(double deduction) {
        this.gold -= deduction;
    }
    
    public void addAttack(double increase){
        this.attack += increase;
    }
    
    public void addHealth(double increase){
        this.curHealth += increase;
        this.maxHealth += increase;
    }
    
    public void addDefense(double increase){
        this.defense += increase;
    }

    public String getName() {
        return playerName;
    }

    public void setName(String playerName) {
        this.playerName = playerName;
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

    public double getGold() {
        return gold;
    }

    public void setGold(double gold) {
        this.gold = gold;
    }

    public Equipment getHelmet() {
        return helmet;
    }

    public void setHelmet(Equipment helmet) {
        this.helmet = helmet;
    }

    public Equipment getChest() {
        return chest;
    }

    public void setChest(Equipment chest) {
        this.chest = chest;
    }

    public Equipment getLeggings() {
        return leggings;
    }

    public void setLeggings(Equipment leggings) {
        this.leggings = leggings;
    }

    public Equipment getBoots() {
        return boots;
    }

    public void setBoots(Equipment boots) {
        this.boots = boots;
    }

    public Equipment getWeapon() {
        return weapon;
    }

    public void setWeapon(Equipment weapon) {
        this.weapon = weapon;
    }

    public ImageIcon getPlayerIcon() {
        return playerIcon;
    }

    public void setPlayerIcon(ImageIcon playerIcon) {
        this.playerIcon = playerIcon;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public double getBaseHealth() {
        return baseHealth;
    }

    public void setBaseHealth(double baseHealth) {
        this.baseHealth = baseHealth;
    }

    public double getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(double baseAttack) {
        this.baseAttack = baseAttack;
    }

    public double getBaseDefense() {
        return baseDefense;
    }

    public void setBaseDefense(double baseDefense) {
        this.baseDefense = baseDefense;
    }

    public double getGoldMultiplier() {
        return goldMultiplier;
    }

    public void setGoldMultiplier(double goldMultiplier) {
        this.goldMultiplier = goldMultiplier;
    }

    public int getHighscore() {
        return highscore;
    }

    public void setHighscore(int highscore) {
        this.highscore = highscore;
    }

}
