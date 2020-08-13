package clickerrpg;

import ChongWaiKit.*;
import CheongKaMeng.*;
import IsabelLai.*;
import OoiPingXiu.*;
import ChongJingYi.*;

import clickerrpg.ui.GameUI;

import java.util.Timer;
import java.util.TimerTask;

public class MainClass {

    public static Player player;
    public static Enemy enemy;
    public static PlayerListInterface<Player> playerList = new PlayerList<Player>();
    public static QueueEnemyInterface<Enemy> enemyQueue = new QueueEnemy<Enemy>();
    public static SortedHelperListInterface<Helper> helperList = new SortedHelperList<Helper>();
    public static SortedHelperListInterface<Helper> assignedHelperList = new SortedHelperList<Helper>();
    public static SLListInterface<Equipment> equipmentInventory = new SortedLinkedList<Equipment>();
    public static UpgradeListInterface<Upgrade> upgradeList = new UpgradeList<Upgrade>();
    public static GameUI gameUI = new GameUI();
    public static double helperTotalDamage;

    public static void main(String args[]) {
        initializeData();
        gameUI.updateGameUI();
        gameUI.startUp();
        
        Timer timer = new Timer();
        timer.schedule(new HelperAttack(), 0, 1000);
    }

    public static void attack(double damage) {
        if (damage - enemy.defense >= 0) {
            enemy.curHealth = enemy.curHealth - (damage - enemy.defense);

            if (enemy.curHealth <= 0) {
                player.gold += 10;

                //SUPPOSED FUNCTION : load next Enemy
                //below is placeholder
                enemy.curHealth = enemy.maxHealth;
            }

            gameUI.updateGameUI();
        }
    }

    public static void initializeData() {
        player = new Player();
        enemy = new Enemy("test", 100, 100, 1, 1, 10);

        
        upgradeList.add(new Upgrade("Hp+10", 0, 10, 0, 30));
        upgradeList.add(new Upgrade("Att+10", 10, 0, 0, 50));
        upgradeList.add(new Upgrade("Df+10", 0, 0, 10, 50));

        // <editor-fold defaultstate="collapsed" desc="Helpers">
        helperList.add(new Helper(2, "Helper2", 20, 200, 1, 100, "HelperWaikit.png"));
        helperList.add(new Helper(5, "Helper5", 50, 500, 1, 250, "HelperWaikit.png"));
        helperList.add(new Helper(3, "Helper3", 30, 300, 1, 150, "player150x90.png"));
        helperList.add(new Helper(8, "Helper8", 80, 800, 1, 400, "player150x90.png"));
        helperList.add(new Helper(6, "Helper6", 60, 600, 1, 300, "HelperWaikit.png"));
        helperList.add(new Helper(7, "Helper7", 70, 700, 1, 350, "player150x90.png"));
        helperList.add(new Helper(4, "Helper4", 40, 400, 1, 200, "player150x90.png"));
        helperList.add(new Helper(1, "Waikit, the xueba", 10, 100, 1, 50, "HelperWaikit.png"));

        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="Enemies">
        enemyQueue.enqueue(new Enemy("Test1", 100, 100, 10, 1, 10));
        enemyQueue.enqueue(new Enemy("Test2", 100, 100, 10, 2, 30));
        enemyQueue.enqueue(new Enemy("Test3", 100, 100, 30, 3, 30));
        enemyQueue.enqueue(new Enemy("Test4", 100, 100, 30, 4, 30));
        enemyQueue.enqueue(new Enemy("Test5", 100, 100, 40, 5, 40));
        enemyQueue.enqueue(new Enemy("Test6", 100, 100, 40, 6, 40));
        enemyQueue.enqueue(new Enemy("Test7", 100, 100, 50, 7, 40));
        enemyQueue.enqueue(new Enemy("Test8", 100, 100, 50, 8, 60));
        enemyQueue.enqueue(new Enemy("Test9", 100, 100, 60, 9, 60));
        enemyQueue.enqueue(new Enemy("Test10", 100, 100, 60, 10, 60));
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Starting Items">
        equipmentInventory.add(new Equipment("Wooden Sword"));
        // </editor-fold>


    }

    public static void updateHelperDamage() {
        helperTotalDamage = 0;
        for (int i = 0; i < assignedHelperList.size(); i++) {
            helperTotalDamage += assignedHelperList.get(i).getDamage();
            System.out.println(assignedHelperList.get(i).getDamage());
        }
    }

    static class HelperAttack extends TimerTask {

        public void run() {
            if (helperTotalDamage > 0) {
                attack(helperTotalDamage);
            }
        }
    }
}
