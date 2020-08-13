package clickerrpg;

import javax.swing.ImageIcon;

public class Consumable {
    private String consName;
    private ImageIcon imageIcon;

    private double attackIncreased;
    private double healthIncreased;    
    private double maxHealthIncreased;
    private double defenseIncreased;
    
    private double price;

    public Consumable(String name){
        switch(name){
            case "Health Potion" :
                this.consName = "Health Potion";
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Wooden_Sword.png"));
                this.healthIncreased = 50;
                this.price = 5;
                
        }
    } 
    
}
