package clickerrpg;

import ChongWaiKit.*;
import CheongKaMeng.*;
import IsabelLai.*;
import OoiPingXiu.*;
import ChongJingYi.*;

import clickerrpg.ui.GameUI;
import clickerrpg.ui.LoginUI;
import clickerrpg.ui.ScoreboardUI;

import java.util.Timer;
import java.util.TimerTask;

public class MainClass {

    public static Player player;
    public static Enemy enemy;
    public static PlayerListInterface<Player> playerList;
    public static QueueEnemyInterface<Enemy> enemyQueue;
    public static SortedHelperListInterface<Helper> helperList;
    public static SortedHelperListInterface<Helper> assignedHelperList;
    public static SLListInterface<Equipment> equipmentList;
    public static SLListInterface<Consumable> consumableList;
    public static SLListInterface<Equipment> equipmentInventory;
    public static SLListInterface<Consumable> consumableInventory;
    public static UpgradeListInterface<Upgrade> upgradeList;
    public static LoginUI loginUI = new LoginUI();
    public static GameUI gameUI = new GameUI();
    public static ScoreboardUI scoreboardUI = new ScoreboardUI();
    public static int stage = 1;
    public static Timer timer;

    public static void main(String args[]) throws InterruptedException {
        initializeData();

        loginUI.startUp();
        while (player == null) {
            Thread.sleep(1000);
        }
        gameUI.updateGameUI();
        gameUI.startUp();

        startAutoAttackTimers();
    }
    
    public static void startAutoAttackTimers(){
        timer = new Timer();
        timer.schedule(new AutoAttacks(), 0, 100);
    }

    public static void stopAutoAttackTimers(){
        timer.cancel();
    }

    public static void attack(double damage) {
        if (damage - enemy.getDefense() >= 0) {
            enemy.setCurHealth(enemy.getCurHealth() - (damage - enemy.getDefense()));

            if (enemy.getCurHealth() <= 0) {
                double gold = enemy.getGoldDropped() * player.getGoldMultiplier();
                player.addGold(gold);
                player.addGoldEarned(gold);
                player.addKill();
                stage++;
                enemyQueue.dequeue();
                if (enemyQueue.isEmpty()) {
                    loadEnemy();
                }
                enemy = enemyQueue.getFront();
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
        equipmentList = new SortedLinkedList<>();
        consumableList = new SortedLinkedList<>();
        equipmentInventory = new SortedLinkedList<>();
        consumableInventory = new SortedLinkedList<>();
        upgradeList = new UpgradeList<>();
        // </editor-fold>
        loadEnemy();
        enemy = enemyQueue.getFront();

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
        helperList.add(new Helper("Mario", 20, 200, 1, 100, "HelperMario.png"));
        helperList.add(new Helper("Finn", 50, 500, 1, 250, "HelperFinn.png"));
        helperList.add(new Helper("SpongeBob", 30, 300, 1, 150, "HelperSpongeBob.png"));
        helperList.add(new Helper("StarWar", 80, 800, 1, 400, "HelperStarwar.png"));
        helperList.add(new Helper("Minion", 60, 600, 1, 300, "HelperMinion.png"));
        helperList.add(new Helper("Pusheen", 70, 700, 1, 350, "HelperPusheen.png"));
        helperList.add(new Helper("Patrick", 40, 400, 1, 200, "HelperPatrick.png"));
        helperList.add(new Helper("Waikit, the xueba", 10, 100, 1, 50, "HelperWaikit.png"));
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Equipment and Consumables">
        equipmentList.add(new Equipment("Wooden Sword"));
        equipmentList.add(new Equipment("Iron Sword"));
        equipmentList.add(new Equipment("Golden Sword"));
        equipmentList.add(new Equipment("Diamond Sword"));
        equipmentList.add(new Equipment("Enchanted Diamond Sword"));

        equipmentList.add(new Equipment("Leather Helmet"));
        equipmentList.add(new Equipment("Chainmail Helmet"));
        equipmentList.add(new Equipment("Iron Helmet"));
        equipmentList.add(new Equipment("Golden Helmet"));
        equipmentList.add(new Equipment("Diamond Helmet"));
        equipmentList.add(new Equipment("Netherite Helmet"));

        equipmentList.add(new Equipment("Leather Chestplate"));
        equipmentList.add(new Equipment("Chainmail Chestplate"));
        equipmentList.add(new Equipment("Iron Chestplate"));
        equipmentList.add(new Equipment("Golden Chestplate"));
        equipmentList.add(new Equipment("Diamond Chestplate"));
        equipmentList.add(new Equipment("Netherite Chestplate"));

        equipmentList.add(new Equipment("Leather Leggings"));
        equipmentList.add(new Equipment("Chainmail Leggings"));
        equipmentList.add(new Equipment("Iron Leggings"));
        equipmentList.add(new Equipment("Golden Leggings"));
        equipmentList.add(new Equipment("Diamond Leggings"));
        equipmentList.add(new Equipment("Netherite Leggings"));

        equipmentList.add(new Equipment("Leather Boots"));
        equipmentList.add(new Equipment("Chainmail Boots"));
        equipmentList.add(new Equipment("Iron Boots"));
        equipmentList.add(new Equipment("Golden Boots"));
        equipmentList.add(new Equipment("Diamond Boots"));
        equipmentList.add(new Equipment("Netherite Boots"));

        consumableList.add(new Consumable("Health Potion"));
        consumableList.add(new Consumable("Greater Health Potion"));
        consumableList.add(new Consumable("Grand Health Potion"));
        consumableList.add(new Consumable("Endurance Potion"));
        consumableList.add(new Consumable("Power Potion"));
        consumableList.add(new Consumable("Protection Potion"));

        // <editor-fold>
        playerList.add(new Player("Player1", 10));
        playerList.add(new Player("Player2", 5));
        playerList.add(new Player("Player3", 7));
        playerList.add(new Player("Player4", 1));
        playerList.add(new Player("Player5", 4));
        playerList.add(new Player("Player1", 10));
        playerList.add(new Player("Player2", 5));
        playerList.add(new Player("Player3", 7));
        playerList.add(new Player("Player4", 1));
        playerList.add(new Player("Player5", 4));
        playerList.add(new Player("Player1", 10));
        playerList.add(new Player("Player2", 5));
        playerList.add(new Player("Player3", 7));
        playerList.add(new Player("Player4", 1));
        playerList.add(new Player("Player5", 4));
        playerList.add(new Player("Player1", 10));
        playerList.add(new Player("Player2", 5));
        playerList.add(new Player("Player3", 7));
        playerList.add(new Player("Player4", 1));
        playerList.add(new Player("Player5", 4));

        // <editor-fold defaultstate="collapsed" desc="Starting Items">
        equipmentInventory.add(new Equipment("Wooden Sword"));
        equipmentInventory.add(new Equipment("Leather Helmet"));
        equipmentInventory.add(new Equipment("Leather Chestplate"));
        equipmentInventory.add(new Equipment("Leather Leggings"));
        equipmentInventory.add(new Equipment("Leather Boots"));

        consumableInventory.add(new Consumable("Health Potion"));
        consumableInventory.add(new Consumable("Health Potion"));
        consumableInventory.add(new Consumable("Health Potion"));
        consumableInventory.add(new Consumable("Health Potion"));
        consumableInventory.add(new Consumable("Health Potion"));
        // </editor-fold>

    }

    public static void helperAttack(Helper helper) {
        if (helper.getCurrentAttackPeriod() < helper.getAttackPeriod()) {
            helper.addCurrentAttackPeriod(100);
        } else {
            if (helper.getDamage() - enemy.getDefense() > 0) {
                attack(helper.getDamage());
                helper.setCurrentAttackPeriod(0);
            }
        }
    }

    static class AutoAttacks extends TimerTask {

        public void run() {
            //enemy attack
            if (enemy.getCurrentAttackPeriod() < enemy.getAttackPeriod()) {
                enemy.addCurrentAttackPeriod(100); //+= 100;
            } else {
                if (enemy.getAttack() - player.getDefense() > 0) {
                    player.takeDamage(enemy.getAttack() - player.getDefense());
                    if (player.getCurHealth() <= 0) {
                        gameOver();

                    }
                    enemy.setCurrentAttackPeriod(0); //=0
                }
            }

            if (assignedHelperList.get(0) != null) {
                helperAttack(assignedHelperList.get(0));
                gameUI.updateHelperAttackBars(1);
            }

            if (assignedHelperList.get(1) != null) {
                helperAttack(assignedHelperList.get(1));
                gameUI.updateHelperAttackBars(2);
            }

            if (assignedHelperList.get(2) != null) {
                helperAttack(assignedHelperList.get(2));
                gameUI.updateHelperAttackBars(3);
            }
            gameUI.updateAttackBars();
            gameUI.updateGameUI();
        }
    }

    //game over
    public static void loadEnemy() {
        enemyQueue.clear();

        enemyQueue.enqueue(new Enemy("Murlocs", 100, 100, 10, 1, 10, 1000, "enemy1.png"));
        enemyQueue.enqueue(new Enemy("Reapers", 100, 100, 10, 2, 30, 1000, "HelperFinn.png"));
        enemyQueue.enqueue(new Enemy("Dark Ganon", 100, 100, 30, 3, 30, 1000, "enemy1.png"));
        enemyQueue.enqueue(new Enemy("Frieza", 100, 100, 30, 4, 30, 1000, "HelperMinion.png"));
        enemyQueue.enqueue(new Enemy("Zinyak", 100, 100, 40, 5, 40, 1000, "HelperWaikit.png"));
        enemyQueue.enqueue(new Enemy("Brutalisks", 100, 100, 40, 6, 40, 1000, "HelperMinion.png"));
        enemyQueue.enqueue(new Enemy("Spriggans", 100, 100, 50, 7, 40, 1000, "enemy1.png"));
        enemyQueue.enqueue(new Enemy("Sephiroth", 100, 100, 50, 8, 60, 1000, "HelperWaikit.png"));
        enemyQueue.enqueue(new Enemy("Straga", 100, 100, 60, 9, 60, 1000, "HelperMinion.png"));
        enemyQueue.enqueue(new Enemy("Deathclaws", 100, 100, 60, 10, 60, 1000, "HelperWaikit.png"));
    }

    public static void gameOver() {
        timer.cancel();
        timer.purge();
        player.setHighscore(stage);
        playerList.add(player);
        scoreboardUI.startUp();
        scoreboardUI.displayScoreboardUI();
    }
}
