package source;

public class GameRunner {
    public static void main(String[] args){
        GameLogic gamelogic = new GameLogic();
        do {
            gamelogic.getPlayerItem();
            gamelogic.getWin();
        }
        while (gamelogic.restart() > 0);
    }

}
