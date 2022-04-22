package com.bl.sportsacademy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Sports Academy");

        Badminton badminton = new Badminton();
        badminton.sportId = "B57963";
        badminton.coachList = new ArrayList();
        badminton.coachList.add("Deepak Kumar");
        badminton.coachList.add("Rehan Singh");
        badminton.coachList.add("Deepesh Joshi");
        badminton.feeAmount = 2000;
        badminton.batch = "Evening";
        badminton.timing = "4pm to 6pm";

        Cricket cricket = new Cricket();
        cricket.sportId = "CRI101";
        cricket.coachList = new ArrayList();
        cricket.coachList.add("Amit Sharma");
        cricket.coachList.add("Bharat Salonki");
        cricket.coachList.add("Rohan Singh");
        cricket.feeAmount = 5000;
        cricket.batch = "Morning";
        cricket.timing = "7am to 10am";

        Football football = new Football();
        football.sportId = "F5Z1245";
        football.coachList = new ArrayList();
        football.coachList.add("Rohan Kumar");
        football.coachList.add("Sanjay Shetty");
        football.coachList.add("Ujjwal Singh");
        football.feeAmount = 4500;
        football.batch = "Morning";
        football.timing = "7am to 11am";

        Swimming swimming = new Swimming();
        swimming.sportId = "SW9756";
        swimming.coachList = new ArrayList();
        swimming.coachList.add("Hemant Sharma");
        swimming.coachList.add("Aditya Joshi");
        swimming.coachList.add("Sagar Singh");
        swimming.feeAmount = 3500;
        swimming.batch = "Morning";
        swimming.timing = "7am to 10am";

        Tennis tennis = new Tennis();
        tennis.sportId = "TNS678";
        tennis.coachList = new ArrayList();
        tennis.coachList.add("Rohan Kumar");
        tennis.coachList.add("Sanjay Shetty");
        tennis.coachList.add("Ujjwal Singh");
        tennis.feeAmount = 2500;
        tennis.batch = "Noon";
        tennis.timing = "12pm to 4pm";

        Player player = new Player();
        player.playerId = "A5879";
        player.name = "Ashok";
        player.age = 22;
        player.mobileNumber = 900000000l;
        player.emailId = "ashok2001@gmail.com";
        player.isFeePaid = false;
        player.sports = new ArrayList();
        player.sports.add(cricket);
        player.sports.add(football);
        player.sports.add(tennis);

        player.play();
        System.out.println();

        //Object created for sportsRepository
        SportsRepository sportsRepository = new SportsRepository();
        //function add called to add all the types of sports in SportsRepository
        sportsRepository.add(badminton);
        sportsRepository.add(tennis);
        sportsRepository.add(football);
        sportsRepository.add(swimming);
        sportsRepository.add(cricket);

        UserInterface userInterface = new UserInterface();
        //userInterface.printAllSports(sportsRepository.getSportList());
        List sportList = sportsRepository.getSportList();
        userInterface.printAllSports(sportList);

        //function remove called to remove the specific sport from SportsRepository
        sportsRepository.remove(cricket);
        sportsRepository.remove(football);
        System.out.println("After removing cricket: ");
        userInterface.printAllSports(sportList);
    }
}
