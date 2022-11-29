package com.java.study.lesson3.task1_inheritance;

public class Main {
    public static void main(String[] args) {
        Pupil pupil1 = new ExcellentPupil();
        Pupil pupil2 = new GoodPupil();
        Pupil pupil3 = new BadPupil();
        Pupil pupil4 = new GoodPupil();

        ClassRoom classRoom = new ClassRoom(pupil1, pupil2, pupil3);
        classRoom.classInfo();
    }
}
