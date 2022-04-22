package com.bl.sportsacademy;

import java.util.List;

public class Player {
    String playerId;
    String name;
    int age;
    List sports;
    long mobileNumber;
    String emailId;
    boolean isFeePaid;


    public void play() {
        System.out.print(name + " plays ");
        for (int i = 0; i < sports.size(); i++) {
            System.out.print(sports.get(i).getClass().getSimpleName());
            if (i < sports.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(".");
    }
}
