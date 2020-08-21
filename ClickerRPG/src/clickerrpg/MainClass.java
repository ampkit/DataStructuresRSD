package clickerrpg;

import ADT.OoiPingXiu.*;
import ADT.IsabelLai.*;
import ADT.ChongWaiKit.*;
import ADT.ChongJingYi.*;
import ADT.CheongKaMeng.*;

import clickerrpg.ui.GameUI;
import clickerrpg.ui.LoginUI;
import clickerrpg.ui.ScoreboardUI;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

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
    public static GameUI gameUI;
    public static ScoreboardUI scoreboardUI;
    public static int stage;
    public static Timer timer;

    public static void main(String args[]) throws InterruptedException {
        startGame();
    }

    public static void startAutoAttackTimers() {
        timer = new Timer();
        timer.schedule(new AutoAttacks(), 0, 100);
    }

    public static void stopAutoAttackTimers() {
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
                player.heal(player.getMaxHealth() * 0.1);
                stage++;
                enemyQueue.dequeue();
                if (enemyQueue.isEmpty()) {
                    loadEnemy();
                }
                enemy = enemyQueue.getFront();
                enemy.increaseStats(stage);
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

        gameUI = new GameUI();
        scoreboardUI = new ScoreboardUI();

        player = null;
        stage = 1;
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
        //<editor-fold>

        //initialize playerList from file "playerHistory.txt"
        try {
            Scanner sc = new Scanner(new FileInputStream("playerHistory.txt"));
            while (sc.hasNextLine()) {
                String[] temp = sc.nextLine().split(",");
                playerList.add(new Player(temp[0], Integer.parseInt(temp[1])));
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

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
            }
            helper.setCurrentAttackPeriod(0);
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
                }
                enemy.setCurrentAttackPeriod(0); //=0
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
        enemyQueue.enqueue(new Enemy("Butcher", 100, 5, 1, 100, 3000, "Enemy_Butcher.png"));
        enemyQueue.enqueue(new Enemy("Stheno the Snake", 100, 3, 2, 100, 1000, "Enemy_Stheno.png"));
        enemyQueue.enqueue(new Enemy("Ghost", 300, 5, 0, 100, 3000, "Enemy_Ghost.png"));
        enemyQueue.enqueue(new Enemy("Luffy the Pirate", 150, 5, 1, 200, 3000, "Enemy_Pirate.png"));
        enemyQueue.enqueue(new Enemy("Spider", 100, 10, 2, 100, 2000, "Enemy_Spider.png"));
        enemyQueue.enqueue(new Enemy("Vesben the Ruthless", 300, 5, 0, 100, 3000, "Enemy_Ghost_2.png"));
        enemyQueue.enqueue(new Enemy("Drake", 500, 10, 5, 300, 5000, "Enemy_Dragon.png"));
        enemyQueue.enqueue(new Enemy("Illidan the Draconian", 800, 15, 7, 500, 5000, "Enemy_Dragon_2.png"));
    }

    public static void gameOver() {
        timer.cancel();
        timer.purge();
        player.setHighscore(stage);
        playerList.add(player);
        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream("playerHistory.txt", true));
            pw.println(player.getPlayerName() + "," + player.getHighscore());
            pw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        gameUI.setVisible(false);
        scoreboardUI.startUp();
        scoreboardUI.displayScoreboardUI();
    }

    public static void startGame() throws InterruptedException {
        initializeData();

        loginUI.revalidate();
        loginUI.startUp();
        Thread.sleep(1000);
        while (player == null) {
            Thread.sleep(1000);
        }
        gameUI.updateGameUI();
        gameUI.startUp();

        startAutoAttackTimers();
    }
}
