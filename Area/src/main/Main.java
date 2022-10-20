package main;

public class Main {
    public static void main(String[] args){
        Area a = new Area();
        do {
            a.getArea();
        } while (a.setRestart() == 1);
    }
}
