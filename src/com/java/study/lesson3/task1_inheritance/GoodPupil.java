package com.java.study.lesson3.task1_inheritance;

public class GoodPupil extends Pupil{
    @Override
    public void read() {
        super.read();
        System.out.println("Добре читає");
    }

    @Override
    public void relax() {
        super.relax();
        System.out.println("Достатньо відпочиває");
    }

    @Override
    public void study() {
        super.study();
        System.out.println("Достатньо навчається");
    }

    @Override
    public void write() {
        super.write();
        System.out.println("Добре пише");
    }
}
