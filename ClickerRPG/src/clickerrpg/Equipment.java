package clickerrpg;

/**
 *
 * @author Chong Wai Kit
 */
public class Equipment implements Comparable<Equipment> {
    //attributes
    String eqName;
    String eqSlot;
    
    double attack;
    double health;
    double defense;

    public Equipment(String eqName, String eqSlot, double attack, double health, double defense) {
        this.eqName = eqName;
        this.eqSlot = eqSlot;
        this.attack = attack;
        this.health = health;
        this.defense = defense;
    }
    
    //create item based on name
    public Equipment(String eqName){
            switch (eqName)  
            {
                case "Wooden Sword" : 
                    setEquipmentAttributes("Wooden Sword", "Weapon", 1, 0, 0);  
                    break;
                case "Tin Sword" : 
                    setEquipmentAttributes("Tin Sword", "Weapon", 2, 0, 0);
                    break;
                default : 
                    setEquipmentAttributes("Error", "Error", 0, 0, 0);
                    break;
            }
    }

    private void setEquipmentAttributes(String eqName, String eqSlot, double attack, double health, double defense) {
        this.eqName = eqName;
        this.eqSlot = eqSlot;
        this.attack = attack;
        this.health = health;
        this.defense = defense;
    }
    
    @Override
    public int compareTo(Equipment comparedEquipment) {
        //compare by slot 
        return 0;
    }

}
