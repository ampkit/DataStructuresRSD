package clickerrpg;

import CheongKaMeng.SortedHelperList;
import CheongKaMeng.SortedHelperListInterface;
import clickerrpg.ui.GameUI;
import ChongWaiKit.SortedLinkedList;
import IsabelLai.UpgradeList;
import IsabelLai.UpgradeListInterface;
import OoiPingXiu.QueueEnemy;
import OoiPingXiu.QueueEnemyInterface;

public class MainClass {

    static Player player;
    static Enemy enemy;
    public static QueueEnemyInterface<Enemy> enemyQueue = new QueueEnemy<Enemy>();
    public static SortedHelperListInterface<Helper> helperList = new SortedHelperList<Helper>();
    static SortedLinkedList<Equipment> equipmentInventory;
    public static UpgradeListInterface<Upgrade> upgradeList = new UpgradeList<Upgrade>();
    static GameUI gameUI = new GameUI();

    public static void main(String args[]) {
        player = new Player();
        //enemy = new Enemy();
        initializeData();
        //gameUI.updateGameUI(player, enemy);
        gameUI.startUp();
    }

    public static void attack() {
        enemy.curHealth = enemy.curHealth - (player.attack - enemy.defense);

        if (enemy.curHealth <= 0) {
            player.gold += 10;

            //SUPPOSED FUNCTION : load next Enemy
            //below is placeholder
            //enemy.curHealth = enemy.maxHealth;
        }

        gameUI.updateGameUI(player, enemy);
    }

    public static void initializeData() {
        upgradeList.add(new Upgrade("Hp+10", 0, 10, 0, 30));
        upgradeList.add(new Upgrade("Att+10", 10, 0, 0, 50));
        upgradeList.add(new Upgrade("Df+10", 0, 0, 10, 50));
        
        //Helper
        helperList.add(new Helper(1, "Helper1", 10, 100, 1, 50, ".png"));
        helperList.add(new Helper(2, "Helper2", 20, 200, 1, 100, ".png"));
        helperList.add(new Helper(3, "Helper3", 30, 300, 1, 150, ".png"));
        helperList.add(new Helper(4, "Helper4", 40, 400, 1, 200, ".png"));
        helperList.add(new Helper(5, "Helper5", 50, 500, 1, 250, ".png"));
        helperList.add(new Helper(6, "Helper6", 60, 600, 1, 300, ".png"));
        helperList.add(new Helper(7, "Helper7", 70, 700, 1, 350, ".png"));
        helperList.add(new Helper(8, "Helper8", 80, 800, 1, 400, ".png"));
        
        
        //enemy
        enemyQueue.enqueue(new Enemy("Test1",100,100,10,1,10));
        enemyQueue.enqueue(new Enemy("Test2",100,100,10,2,30));
        enemyQueue.enqueue(new Enemy("Test3",100,100,30,3,30));
        enemyQueue.enqueue(new Enemy("Test4",100,100,30,4,30));
        enemyQueue.enqueue(new Enemy("Test5",100,100,40,5,40));
        enemyQueue.enqueue(new Enemy("Test6",100,100,40,6,40));
        enemyQueue.enqueue(new Enemy("Test7",100,100,50,7,40));
        enemyQueue.enqueue(new Enemy("Test8",100,100,50,8,60));
        enemyQueue.enqueue(new Enemy("Test9",100,100,60,9,60));
        enemyQueue.enqueue(new Enemy("Test10",100,100,60,10,60));
    }
}
