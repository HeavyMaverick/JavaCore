package source;

import java.util.Scanner;

public class GameLogic {
    public static int rnd() {
        return (int) (Math.random()*(3) + 1);
    }
    public int c = 0;
    public int p;
    public String getCompItem() {
        switch (rnd()) {
            case 1 -> {
                c = 1;
                return "Rock";
            }
            case 2 -> {
                c = 2;
                return "Paper";
            }
            case 3 -> {
                c = 3;
                return "Scissors";
            }
            default -> {
                return "Exception";
            }
        }
    }
    public void getPlayerItem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your item - 1 = \"Rock\" 2 = \"Paper\" 3 = \"Scissors\"");
        p = scanner.nextInt();
        if (p == 1) {
            System.out.println("You've picked Rock");
        }
        else if (p == 2) {
            System.out.println("You've picked Paper");
        }
        else if (p == 3) {
            System.out.println("You've picked Scissors");
        }
        System.out.println("Computer picked " + getCompItem());
    }
    public void getWin(){
        if (c == 1 && p == 1) System.out.println("Draw");
        if (c == 1 && p == 2) System.out.println("Player win");
        if (c == 1 && p == 3) System.out.println("Computer win");
        if (c == 2 && p == 1) System.out.println("Computer win");
        if (c == 2 && p == 2) System.out.println("Draw");
        if (c == 2 && p == 3) System.out.println("Player win");
        if (c == 3 && p == 1) System.out.println("Player win");
        if (c == 3 && p == 2) System.out.println("Computer win");
        if (c == 3 && p == 3) System.out.println("Draw");
    }
    public int restart(){
        Scanner in = new Scanner(System.in);
        System.out.println("Restart? 1 = yes, 0 = no");
        return in.nextInt();
    }
}
