package clickerrpg;

import javax.swing.ImageIcon;

public class Consumable implements Comparable<Consumable>{
    private String consName;
    private ImageIcon imageIcon;
     
    private double attackIncreased = 0;
    private double healthIncreased = 0;    
    private double maxHealthIncreased = 0;
    private double defenseIncreased = 0;
    
    private double price = 0;

    public Consumable(String name){
        switch(name){
            case "Health Potion" :
                consName = "Health Potion";
                imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Health_Potion.png"));
                healthIncreased = 100;
                price = 5;            
                break;
            case "Greater Health Potion" :
                consName = "Greater Health Potion";
                imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Greater_Health_Potion.png"));
                healthIncreased = 200;
                price = 20;
                break;
        }
    } 
    
    public void consume(Player player){
        if (healthIncreased != 0) { 
            player.heal(healthIncreased);
        }
    }
   
    @Override
    public int compareTo(Consumable comparedConsumable){
        return (int)comparedConsumable.price - (int)price;
    }

    public String getConsName() {
        return consName;
    }

    public void setConsName(String consName) {
        this.consName = consName;
    }

    public ImageIcon getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    public double getAttackIncreased() {
        return attackIncreased;
    }

    public void setAttackIncreased(double attackIncreased) {
        this.attackIncreased = attackIncreased;
    }

    public double getHealthIncreased() {
        return healthIncreased;
    }

    public void setHealthIncreased(double healthIncreased) {
        this.healthIncreased = healthIncreased;
    }

    public double getMaxHealthIncreased() {
        return maxHealthIncreased;
    }

    public void setMaxHealthIncreased(double maxHealthIncreased) {
        this.maxHealthIncreased = maxHealthIncreased;
    }

    public double getDefenseIncreased() {
        return defenseIncreased;
    }

    public void setDefenseIncreased(double defenseIncreased) {
        this.defenseIncreased = defenseIncreased;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
}
