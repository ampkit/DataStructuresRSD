
package clickerrpg;

import ChongJingYi.PlayerList;

public class AllPlayerList {
    
    public static PlayerList<Player> playerlist = new PlayerList();

    public static PlayerList getPlayerlist() {
        return playerlist;
    }

    public static void setPlayerlist(PlayerList playerlist) {
        AllPlayerList.playerlist = playerlist;
    }
    
    
}
