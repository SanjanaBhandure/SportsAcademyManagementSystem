package com.bl.sportsacademy;

import java.util.List;

public class Sport {
    String sportId;
    String sportsName;
    List coachList;
    int feeAmount;
    String batch;
    String timing;

    @Override
    public String toString() {
        return "Sport{" +
                "sportId='" + sportId + '\'' +
                ", sportsName='" + sportsName + '\'' +
                ", coachList=" + coachList +
                ", feeAmount=" + feeAmount +
                ", batch='" + batch + '\'' +
                ", timing='" + timing + '\'' +
                '}';
    }
}

