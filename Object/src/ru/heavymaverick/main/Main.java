package ru.heavymaverick.main;

public class Main {

    public static void main(String[] args) {
        Human human = new Human("Mihail", 17, "Student");
        System.out.println(human);
        User user = new User();
        System.out.println(user);
        User user1 = new User();
        System.out.println(user1);
        System.out.println("user == user1 -> " + user.equals(user1));
        Object object = new Object();
        System.out.println(object);
    }
}
/* String toString() Возвращает строковое представление объекта.
* int hashCode()
* boolean equals(Object obj)
* Class getClass()
* notify() Продолжает работу потока. Используется с synchronized
* notifyAll()
* wait(long timeout)
* finalize() - deprecated
* Object clone() - Создает дубликат объекта.
* */