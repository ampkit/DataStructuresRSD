
package clickerrpg;

import javax.swing.ImageIcon;


public class Upgrade {
    private String itemName;
    private String type;
    private double attack;
    private double health;
    private double defense;
    private double cost;
    private ImageIcon imageIcon;
    
    public Upgrade(String name,String type, double attack, double health, double defense, double cost)
    {
        this.itemName = name;
        this.type= type;
        this.attack = attack;
        this.health = health;
        this.defense = defense;
        this.cost = cost;
    }
    
     public Upgrade(String name) {
        switch (name) {
            case "Hp+10":
                setItems("HEALTH +10","upgrade",0, 10, 0,30);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/hp+10.png"));
                break;
            case "Df+10":
                setItems("DEFENSE +10","upgrade",0,0,10,30);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Defense 10.png"));
                break;
            case "Att+10":
                setItems("ATTACK +10","upgrade",10, 0, 0,50);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Attack+10.png"));
                break;
            case "Hp+20":
                setItems("HEALTH +20","upgrade",0, 20, 0,50);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/hp+20.png"));
                break;
            case "Df+20":
                setItems("DEFENSE +20","upgrade",0,0,20,50);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Defense 20.png"));
                break;
            case "Att+20":
                setItems("ATTACK +20","upgrade",20, 0, 0,70);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Attack+10.png"));
                break;
            case "Hp+30":
                setItems("HEALTH +30","upgrade",0, 30, 0,70);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/hp+20.png"));
                break;
            case "Df+30":
                setItems("DEFENSE +30","upgrade",0,0,30,70);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Defense 20.png"));
                break;
            case "Att+30":
                setItems("ATTACK +30","upgrade",30, 0, 0,90);
                this.imageIcon = new ImageIcon(getClass().getResource("/clickerrpg/img/Attack+10.png"));
                break;   
            
                default:
                setItems("Error", "Error",0, 0, 0, 0);
                break;
                
        }
    }
     
     private void setItems(String name,String type,double attack, double health, double defense, double cost) {
        this.itemName = name;
        this.type = type;
        this.attack = attack;
        this.health = health;
        this.defense = defense;
        this.cost = cost;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Getter/Setter">
    public String getName()
    {
        return itemName;
    }
    
    public void setName(String name)
    {
        this.itemName = name;
    }
    
    public String getType()
    {
        return type;
    }
    
    public void setType(String type)
    {
        this.type = type;
    }
    
    public double getAttack()
   {
       return attack;
   }
    
    public void setAttack(double attack)
    {
        this.attack = attack;
    }
    
    public double getHealth()
    {
        return health;
    }
    
    public void setHealth(double health)
    {
        this.health = health;
    }
    
    public double getDefense()
    {
        return defense;
    }
    
    public void setDefense(double defense)
    {
        this.defense = defense;
    }
    
    public double getCost()
    {
        return cost;
    }
    
    public void setCost(double cost)
    {
        this.cost = cost;
    }
    
    public ImageIcon getImg()
    {
        return imageIcon;
    }
    
    public void setImg(ImageIcon img)
    {
        this.imageIcon = img;
    }
    // </editor-fold>
}
