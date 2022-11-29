package com.java.study.lesson3.task2_constr;

public class Plane extends Vehicle{
    public double height = 4000.5;
    public int passengerCapacity = 5;

    public Plane(int price, int speed, int year) {
        System.out.println("Ціна: " + price + ", Швидкість: " + speed + ", Рік: " + year +
                ", Пасажироємність: " + passengerCapacity + " Висота: " + height);
    }
}
