package clickerrpg;

import ChongWaiKit.*;
import CheongKaMeng.*;
import IsabelLai.*;
import OoiPingXiu.*;
import ChongJingYi.*;

import clickerrpg.ui.GameUI;
import clickerrpg.ui.LoginUI;

import java.util.Timer;
import java.util.TimerTask;

public class MainClass {

    public static Player player;
    public static Enemy enemy;
    public static PlayerListInterface<Player> playerList;
    public static QueueEnemyInterface<Enemy> enemyQueue;
    public static SortedHelperListInterface<Helper> helperList;
    public static SortedHelperListInterface<Helper> assignedHelperList;
    public static SLListInterface<Equipment> equipmentInventory;
    public static SLListInterface<Consumable> consumableInventory;
    public static UpgradeListInterface<Upgrade> upgradeList;
    public static LoginUI loginUI = new LoginUI();
    public static GameUI gameUI = new GameUI();
    public static double helperTotalDamage; 
    public static int stage = 1;

    public static void main(String args[]) throws InterruptedException {
        initializeData();

        loginUI.startUp();
        while (player == null) {
            Thread.sleep(1000);
        }
        gameUI.updateGameUI();
        gameUI.startUp();

        Timer timer = new Timer();
        timer.schedule(new Helper1Attack(), 0, 100);
        timer.schedule(new Helper2Attack(), 0, 100);
        timer.schedule(new Helper3Attack(), 0, 100);

        Timer enemyAttackTimer = new Timer();
        timer.schedule(new AutoAttacks(), 0, 100);

    }

    public static void attack(double damage) {
        if (damage - enemy.getDefense() >= 0) {
            
            enemy.setCurHealth(enemy.getCurHealth() - (damage - enemy.getDefense()));
            
            //enemy.getCurHealth()= enemy.setCurHealth(enemy.getCurHealth() - (damage - enemy.getDefense()));

            if (enemy.getCurHealth() <= 0) {
                //player.gold += 10;
                player.addGold(enemy.getGoldDropped());
                stage++;
                enemyQueue.dequeue();
                enemy = enemyQueue.getFront();
                //below is placeholder
                enemy.getCurHealth() = enemy.getMaxHealth();
            }

            gameUI.updateGameUI();
        }
    }

    public static void initializeData() {
        // <editor-fold defaultstate="collapsed" desc="Collections">
        playerList = new PlayerList<>();
        enemyQueue = new QueueEnemy<>();
        helperList = new SortedHelperList<>();
        assignedHelperList = new SortedHelperList<>();
        equipmentInventory = new SortedLinkedList<>();
        consumableInventory = new SortedLinkedList<>();
        upgradeList = new UpgradeList<>();
        // </editor-fold>

        enemy = new Enemy("test", 100, 100, 10, 1, 10,0,1000);

        upgradeList.add(new Upgrade("Hp+10"));
        upgradeList.add(new Upgrade("Att+10"));
        upgradeList.add(new Upgrade("Df+10"));
        upgradeList.add(new Upgrade("Hp+20"));
        upgradeList.add(new Upgrade("Att+20"));
        upgradeList.add(new Upgrade("Df+20"));
        upgradeList.add(new Upgrade("Hp+30"));
        upgradeList.add(new Upgrade("Att+30"));
        upgradeList.add(new Upgrade("Df+30"));
        upgradeList.add(new Upgrade("Hp+40"));
        upgradeList.add(new Upgrade("Att+40"));
        upgradeList.add(new Upgrade("Df+40"));

        // <editor-fold defaultstate="collapsed" desc="Helpers">
        helperList.add(new Helper(2, "Mario", 20, 200, 1, 100, "HelperMario.png"));
        helperList.add(new Helper(5, "Finn", 50, 500, 1, 250, "HelperFinn.png"));
        helperList.add(new Helper(3, "SpongeBob", 30, 300, 1, 150, "HelperSpongeBob.png"));
        helperList.add(new Helper(8, "StarWar", 80, 800, 1, 400, "HelperStarwar.png"));
        helperList.add(new Helper(6, "Minion", 60, 600, 1, 300, "HelperMinion.png"));
        helperList.add(new Helper(7, "Pusheen", 70, 700, 1, 350, "HelperPusheen.png"));
        helperList.add(new Helper(4, "Patrick", 40, 400, 1, 200, "HelperPatrick.png"));
        helperList.add(new Helper(1, "Waikit, the xueba", 10, 100, 1, 50, "HelperWaikit.png"));
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Enemies">
        enemyQueue.enqueue(new Enemy("Murlocs", 100, 100, 10, 1, 10,0,1000));
        enemyQueue.enqueue(new Enemy("Reapers", 100, 100, 10, 2, 30,0,1000));
        enemyQueue.enqueue(new Enemy("Dark Ganon", 100, 100, 30, 3, 30,0,1000));
        enemyQueue.enqueue(new Enemy("Frieza", 100, 100, 30, 4, 30,0,1000));
        enemyQueue.enqueue(new Enemy("Zinyak", 100, 100, 40, 5, 40,0,1000));
        enemyQueue.enqueue(new Enemy("Brutalisks", 100, 100, 40, 6, 40,0,1000));
        enemyQueue.enqueue(new Enemy("Spriggans", 100, 100, 50, 7, 40,0,1000));
        enemyQueue.enqueue(new Enemy("Sephiroth", 100, 100, 50, 8, 60,0,1000));
        enemyQueue.enqueue(new Enemy("Straga", 100, 100, 60, 9, 60,0,1000));
        enemyQueue.enqueue(new Enemy("Deathclaws", 100, 100, 60, 10, 60,0,1000));
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Starting Items">
        equipmentInventory.add(new Equipment("Wooden Sword"));
        equipmentInventory.add(new Equipment("Leather Helmet"));
        equipmentInventory.add(new Equipment("Leather Chestplate"));
        equipmentInventory.add(new Equipment("Leather Leggings"));
        equipmentInventory.add(new Equipment("Leather Boots"));

        consumableInventory.add(new Consumable("Health Potion"));
        // </editor-fold>

    }

    public static void updateHelperDamage() {
        helperTotalDamage = 0;
        for (int i = 0; i < assignedHelperList.size(); i++) {
            helperTotalDamage += assignedHelperList.get(i).getDamage();
        }
    }

    static class Helper1Attack extends TimerTask {

        public void run() {
            if (assignedHelperList.get(0) != null) {
                Helper helper = assignedHelperList.get(0);
                if (helper.getCurrentAttackPeriod() < helper.getAttackPeriod()) {
                    helper.addCurrentAttackPeriod(100);
                } else {
                    if (helper.getDamage() - enemy.getDefense() > 0) {
                        attack(helper.getDamage());
                        helper.setCurrentAttackPeriod(0);
                    }
                }

                gameUI.updateHelperAttackBars(1);
            }
        }
    }

    static class Helper2Attack extends TimerTask {

        public void run() {
            if (assignedHelperList.get(1) != null) {
                Helper helper = assignedHelperList.get(1);
                if (helper.getCurrentAttackPeriod() < helper.getAttackPeriod()) {
                    helper.addCurrentAttackPeriod(100);
                } else {
                    if (helper.getDamage() - enemy.getDefense() > 0) {
                        attack(helper.getDamage());
                        helper.setCurrentAttackPeriod(0);
                    }
                }

                gameUI.updateHelperAttackBars(2);
            }
        }
    }

    static class Helper3Attack extends TimerTask {

        public void run() {
            if (assignedHelperList.get(2) != null) {
                Helper helper = assignedHelperList.get(2);
                if (helper.getCurrentAttackPeriod() < helper.getAttackPeriod()) {
                    helper.addCurrentAttackPeriod(100);
                } else {
                    if (helper.getDamage() - enemy.getDefense() > 0) {
                        attack(helper.getDamage());
                        helper.setCurrentAttackPeriod(0);
                    }
                }

                gameUI.updateHelperAttackBars(3);
            }
        }
    }

    static class AutoAttacks extends TimerTask {

        public void run() {
            //enemy attack
            if (enemy.getCurrentAttackPeriod() < enemy.getAttackPeriod()) {
                enemy.setAttackPeriod(100); //+= 100;
            } else {
                if (enemy.getAttack() - player.defense > 0) {
                    player.takeDamage(enemy.getAttack() - player.defense);
                    enemy.setCurrentAttackPeriod(0); //=0
                }
            }

            gameUI.updateAttackBars();
            gameUI.updateGameUI();
        }
    }
    
    //game over
    public static void reloadEnemy(){
        enemyQueue.clear();
        
        enemyQueue.enqueue(new Enemy("Murlocs", 100, 100, 10, 1, 10,0,1000));
        enemyQueue.enqueue(new Enemy("Reapers", 100, 100, 10, 2, 30,0,1000));
        enemyQueue.enqueue(new Enemy("Dark Ganon", 100, 100, 30, 3, 30,0,1000));
        enemyQueue.enqueue(new Enemy("Frieza", 100, 100, 30, 4, 30,0,1000));
        enemyQueue.enqueue(new Enemy("Zinyak", 100, 100, 40, 5, 40,0,1000));
        enemyQueue.enqueue(new Enemy("Brutalisks", 100, 100, 40, 6, 40,0,1000));
        enemyQueue.enqueue(new Enemy("Spriggans", 100, 100, 50, 7, 40,0,1000));
        enemyQueue.enqueue(new Enemy("Sephiroth", 100, 100, 50, 8, 60,0,1000));
        enemyQueue.enqueue(new Enemy("Straga", 100, 100, 60, 9, 60,0,1000));
        enemyQueue.enqueue(new Enemy("Deathclaws", 100, 100, 60, 10, 60,0,1000));
    }
}
