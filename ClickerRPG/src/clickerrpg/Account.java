package clickerrpg;

import ChongJingYi.PlayerListInterface;
import java.util.Objects;

public class Account {
    private String playerName;
    private PlayerListInterface<Player> player;
    //Player player;

    public Account() {
    }

    public Account(String playerName, PlayerListInterface<Player> player) {
        this.playerName = playerName;
        this.player = player;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public PlayerListInterface<Player> getPlayer() {
        return player;
    }

    public void setPlayer(PlayerListInterface<Player> player) {
        this.player = player;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Account other = (Account) obj;
        if (!Objects.equals(this.playerName, other.playerName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        
        String str = "Player:\n" + "Player Name : ";
        return str;
    }
    
    
}
