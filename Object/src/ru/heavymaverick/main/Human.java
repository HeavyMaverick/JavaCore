package ru.heavymaverick.main;

public class Human {
    private String name;
    private String job;
    private int age;
    public Human(String name, int age, String job){
        this.name = name;
        this.age = age;
        this.job = job;
    }
    public String toString(){
        return name + " " + age + " " + job;
    }

}
