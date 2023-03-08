package service.logic;

import entity.TravelClub;
import service.ClubService;

import java.util.Arrays;

public class ClubServiceLogic implements ClubService {

    private TravelClub[] clubs;
    int index;

    public ClubServiceLogic() {
        this.clubs = new TravelClub[10];
        this.index = 0;
    }

    @Override
    public void register(TravelClub travelClub) {
        clubs[index] = travelClub;
        index++;
    }

    @Override
    public TravelClub[] findAll() {
        return Arrays.copyOfRange(clubs, 0, index);
    }

    @Override
    public TravelClub[] findByName(String clubName) {
        TravelClub[] createdClubs = Arrays.copyOfRange(clubs,0, index);
        TravelClub[] foundClubs = new TravelClub[createdClubs.length];
        int subIndex = 0;

        for (TravelClub club: createdClubs) {
            if (club.getClubName().equals(clubName)) {
                foundClubs[subIndex] = club;
                subIndex++;
            }
        }

        return Arrays.copyOfRange(foundClubs, 0, subIndex);
    }


    @Override
    public TravelClub findById(String clubId) {
        TravelClub foundClub = null;
        TravelClub[] createdClub = Arrays.copyOfRange(clubs,0, index);
        for (TravelClub club : createdClub) {
            if (club.getId().equals(clubId)) {
                foundClub = club;
                break;
            }
        }
        return foundClub;
    }

    @Override
    public void modify(TravelClub modifyClub) {
        int foundIndex = 0;
        for (int i=0;i<clubs.length; i++) {
            if (clubs[i].getId().equals(modifyClub.getId())) {
                foundIndex = i;
                break;
            }
        }
        this.clubs[foundIndex] = modifyClub;
    }

    @Override
    public void remove(String clubId) {
        int foundIndex = 0;
        for (int i=0;i<clubs.length; i++) {
            if (clubs[i].getId().equals(clubId)) {
                foundIndex = i;
                break;
            }
        }

        for(int i=foundIndex; i<this.index; i++) {
            clubs[i] = clubs[i+1];
        }

        index--;
    }

}
