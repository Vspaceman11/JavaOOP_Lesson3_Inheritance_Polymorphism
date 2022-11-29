package com.java.study.lesson3.task1_inheritance;

public class ExcellentPupil extends Pupil{
    @Override
    public void read() {
        super.read();
        System.out.println("Відмінно читає");
    }

    @Override
    public void relax() {
        super.relax();
        System.out.println("Мало відпочиває");
    }

    @Override
    public void study() {
        super.study();
        System.out.println("Відмінно навчається");
    }

    @Override
    public void write() {
        super.write();
        System.out.println("Відмінно пише");
    }
}
