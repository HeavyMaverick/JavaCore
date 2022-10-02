package ru.heavymaverick.main;

public class Main {
    // Вычислить расстояние, проходимое светом,
    // Используя переменные типа long
    public static void main(String[] args) {
        int lightspeed; // 32bit -2147483648 to 2147483647
        long days; // 64bit -9223372036854775808 до 9223372036854775807
        long seconds;
        long distance;

        // приблизительная скорость света, миль в секунду
        lightspeed = 186000;

        days = 1000; // указать количества дней

        seconds = days * 24 * 60 * 60; // преобразовать в секунды

        distance = lightspeed * seconds; // вычислить расстояние

        System.out.println("За " + days);
        System.out.println(" дней свет пройдет около ");
        System.out.println(distance + " миль.");
    }
}
