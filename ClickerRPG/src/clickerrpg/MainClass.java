package clickerrpg;

import clickerrpg.ui.GameUI;
import ChongWaiKit.SortedLinkedList;
import IsabelLai.UpgradeList;
import IsabelLai.UpgradeListInterface;

public class MainClass {

    static Player player;
    static Enemy enemy;
    static SortedLinkedList<Equipment> equipmentInventory;
    public static UpgradeListInterface<Upgrade> upgradeList = new UpgradeList<Upgrade>();
    static GameUI gameUI = new GameUI();

    public static void main(String args[]) {
        player = new Player();
        enemy = new Enemy();
        initializeData();
        gameUI.updateGameUI(player, enemy);
        gameUI.startUp();
    }

    public static void attack() {
        enemy.curHealth = enemy.curHealth - (player.attack - enemy.defense);

        if (enemy.curHealth <= 0) {
            player.gold += 10;

            //SUPPOSED FUNCTION : load next Enemy
            //below is placeholder
            enemy.curHealth = enemy.maxHealth;
        }

        gameUI.updateGameUI(player, enemy);
    }

    public static void initializeData() {
        upgradeList.add(new Upgrade("Hp+10", 0, 10, 0, 30));
        upgradeList.add(new Upgrade("Att+10", 10, 0, 0, 50));
        upgradeList.add(new Upgrade("Df+10", 0, 0, 10, 50));

    }
}
