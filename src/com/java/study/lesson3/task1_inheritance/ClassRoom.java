package com.java.study.lesson3.task1_inheritance;

public class ClassRoom {
    public Pupil [] pupils = new Pupil[4];
    public ClassRoom(Pupil pupil1) {
        this.pupils[0] = pupil1;
    }
    public ClassRoom(Pupil pupil1, Pupil pupil2){
        this(pupil1);
        this.pupils[1] = pupil2;
    }
    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3){
        this(pupil1,pupil2);
        this.pupils[2] = pupil3;
    }
    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4){
        this(pupil1, pupil2, pupil3);
        this.pupils[3] = pupil4;
    }
    public void classInfo(){
        for (int i = 0; i < pupils.length; i++) {
            if (pupils [i] != null) {
                System.out.println();
                System.out.println("Ученик номер " + (i + 1));
                pupils[i].study();
                pupils[i].read();
                pupils[i].relax();
                pupils[i].write();
            }
        }
    }
}
