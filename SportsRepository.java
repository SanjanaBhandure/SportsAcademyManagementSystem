package com.bl.sportsacademy;
import java.util.ArrayList;
import java.util.List;

public class SportsRepository {
    private List sportList = new ArrayList();

    public void add(Sport sport) {
        sportList.add(sport);
    }

    public void remove(Sport sport) {
        sportList.remove(sport);
    }

    public List getSportList() {
        return sportList;
    }
}
