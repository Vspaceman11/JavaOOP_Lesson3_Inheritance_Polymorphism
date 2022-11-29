package com.java.study.lesson3.task4_printer;

import java.util.Scanner;

public class ChangeColor extends Printer{
    public static final String ANSI_RESET = "\u001B[0m";

    public static final String RED_COLOR = "\u001B[31m";
    public static final String GREEN_COLOR = "\u001B[32m";
    public static final String BLUE_COLOR = "\u001B[34m";
    public static final String YELLOW_COLOR = "\u001B[33m";

    @Override
    public void print(String value) {
        System.out.println("Введіть бажиний кольор тексту: red, green, blue, yellow.");
        Scanner input = new Scanner(System.in);
        String userColor = input.next().toLowerCase();
        switch (userColor) {
            case "red" -> System.out.println(RED_COLOR + value + ANSI_RESET);
            case "green" -> System.out.println(GREEN_COLOR + value + ANSI_RESET);
            case "blue" -> System.out.println(BLUE_COLOR + value + ANSI_RESET);
            case "yellow" -> System.out.println(YELLOW_COLOR + value + ANSI_RESET);
            default ->
                    System.out.println("Ви ввели не вірний колір доступні кольори: червоний, зелений, синій, жовтий.");
        }
    }
}
