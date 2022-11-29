package com.java.study.lesson3.task4_printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Printer changeColor = new ChangeColor();
        System.out.println("Введіть бажаний текст.");
        changeColor.print(input.nextLine());

    }
}
