package com.java.study.lesson3.task1_inheritance;

public class BadPupil extends Pupil{
    @Override
    public void read() {
        super.read();
        System.out.println("Погано читає");
    }

    @Override
    public void relax() {
        super.relax();
        System.out.println("Багато відпочиває");
    }

    @Override
    public void study() {
        super.study();
        System.out.println("Мало навчається");
    }

    @Override
    public void write() {
        super.write();
        System.out.println("Погано пише");
    }
}
