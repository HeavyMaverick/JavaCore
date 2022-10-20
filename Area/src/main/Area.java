package main;

import java.util.Scanner;

public class Area {
    public double pi=3.1416, r, a;
    public void getArea(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Введите радиус окружности");
        r = s1.nextInt();
        a = pi * r * r;
        System.out.println("Радиус окружности = " + a);
    }
    public int setRestart(){
        System.out.println("Нужно вычислить площадь еще раз? Введите единицу\nВведите ноль, если более не требуется");
        Scanner s2 = new Scanner(System.in);
        return s2.nextInt();
    }
}
