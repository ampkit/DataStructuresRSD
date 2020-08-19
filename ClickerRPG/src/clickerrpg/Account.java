package clickerrpg;

import ADT.ChongJingYi.PlayerListInterface;
import java.util.Objects;

public class Account {
    private String playerName;
    private int score;
    private PlayerListInterface<Player> player;
    //Player player;

    public Account() {
    }

    public Account(String playerName, int score) {
        this.playerName = playerName;
        this.score = score;
        //this.player = player;
    }


    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
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
