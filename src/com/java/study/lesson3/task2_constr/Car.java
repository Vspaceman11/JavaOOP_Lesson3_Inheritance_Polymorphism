package com.java.study.lesson3.task2_constr;

public class Car extends Vehicle{
    public Car(int price, int speed, int year){
        System.out.println("Ціна: " + price + ", Швидкість: " + speed + ", Рік: " + year);
    }
}
