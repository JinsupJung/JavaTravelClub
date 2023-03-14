package chap03.travelclub.entity;
import chap03.travelclub.util.DateUtil;

import java.util.UUID;

public class TravelClub {
    private static final int MINIMUM_NAME_LENGTH = 3;
    private static final int MINIMUM_INTRO_LENGTH = 3;

    private String id;
    private String clubName;
    private String intro;
    private String foundationDay;

    // private으로 선언
    private TravelClub() {
        this.id = UUID.randomUUID().toString();
    }
    public TravelClub(String name, String intro) {
        this();
        this.clubName = name;
        this.intro = intro;
        this.foundationDay = DateUtil.today();
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        if (clubName.length() < MINIMUM_NAME_LENGTH){
            System.out.println("Not enought Name length");
            return;
        }
        this.clubName = clubName;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        if(intro.length() < MINIMUM_INTRO_LENGTH){
            System.out.println("Not enough Intro length");
            return;
        }
        this.intro = intro;
    }

    //static으로 선언해서 바로 불러서 쓴다
    public static TravelClub getSample() {
        return new TravelClub("Jaju","Jeju Introduction");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(" Travel club ID :").append(id);
        builder.append(" Name :").append(clubName);
        builder.append(" Intro : ").append(intro);
        builder.append(" Foundation Day :").append(foundationDay);
        return builder.toString();
    }

    public String getId() {
        return this.id;
    }
}
