package clickerrpg;

import clickerrpg.ui.GameUI;
import ChongWaiKit.SortedLinkedList;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.AbstractButton;

public class MainClass {

    static Player player;
    static Enemy enemy;
    static SortedLinkedList<Equipment> equipmentInventory;
    static GameUI gameUI = new GameUI();

    public static void main(String args[]) {
        player = new Player();
        enemy = new Enemy();

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

}
