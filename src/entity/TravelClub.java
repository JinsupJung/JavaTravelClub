package entity;

import util.DateUtil;

import java.util.UUID;

public class TravelClub {
    public static final int MINIMUM_NAME_LENGTH = 3;
    public static final int MINIMUM_INTRO_LENGTH = 5;

    private String id;
    private String clubName;
    private String intro;
    private String foundationDay;

    private TravelClub() {
        this.id = UUID.randomUUID().toString();
    }

    public TravelClub(String clubName, String intro) {
        this();
        setClubName(clubName);
        setIntro(intro);
        this.foundationDay = DateUtil.today();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        if (clubName.length() < MINIMUM_NAME_LENGTH) {
            System.out.println("club name length");
            return;
        }
        this.clubName = clubName;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        if (intro.length() < MINIMUM_INTRO_LENGTH) {
            System.out.println("intro length ");
            return;
        }
        this.intro = intro;
    }

    public String getFoundationDay() {
        return foundationDay;
    }
    public static TravelClub getSample() {
        return new TravelClub("Club name", "Club intro");
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
}
