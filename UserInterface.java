package com.bl.sportsacademy;

import java.util.List;

public class UserInterface {
    public void printAllSports(List sport) {
        for (int i = 0; i < sport.size(); i++ ) {
            System.out.println(sport.get(i));
        }
    }
}
