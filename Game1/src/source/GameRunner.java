package source;

public class GameRunner extends GameLogic {
    public static void main(String[] args){
        do {
            PlayerItem();
            WinOrLose();
        }
        while (GameLogic.Restart() > 0);
    }

}
