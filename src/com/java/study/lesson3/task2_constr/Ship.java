package com.java.study.lesson3.task2_constr;

public class Ship extends Vehicle{
    public int passengerCapacity = 25;
    public String portOfRegistry = "Odesa";
    public Ship(int price, int speed, int year){
        System.out.println("Ціна: " + price + ", Швидкість: " + speed + ", Рік: " + year +
                ", Пасажироємність: " + passengerCapacity + " Порт приписки: " + portOfRegistry);
    }
}
