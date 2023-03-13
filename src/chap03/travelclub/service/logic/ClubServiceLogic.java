package chap03.travelclub.service.logic;

import chap03.travelclub.entity.TravelClub;
import chap03.travelclub.service.ClubService;
import chap03.travelclub.store.ClubStore;
import chap03.travelclub.store.StoreLifeCycler;

import java.util.*;

public class ClubServiceLogic implements ClubService {
    private ClubStore clubStore;

    public ClubServiceLogic() {
        this.clubStore = StoreLifeCycler.getUniqueInstance().requestClubStore();
//        this.index = 0;
    }

    @Override
    public void register(TravelClub travelClub) {
        this.clubStore.create(travelClub);
//        clubs[index] = travelClub;
//        index++;
    }
    @Override
    public List<TravelClub> findAll() {
        return this.clubStore.retrieveAll();
//        return Arrays.copyOfRange(clubs, 0, index);
    }
    @Override
    public TravelClub findById(String clubId) {
        return this.clubStore.retrieve(clubId);
    }
    @Override
    public List<TravelClub> findByName(String clubName) {


        return this.clubStore.retrieveAllByName(clubName);

//        TravelClub[] createdClub = Arrays.copyOfRange(clubs, 0, index);
//        TravelClub[] foundClubs = new TravelClub[createdClub.length];
//        int subIndex = 0;
//
//        for (TravelClub club : createdClub){
//            if (club.getClubName().equals(clubName)){
//                foundClubs[subIndex] = club;
//                subIndex++;
//            }
//        }
//        return Arrays.copyOfRange(foundClubs, 0, subIndex);
    }
    @Override
    public void modify(TravelClub modifyClub) {
        clubStore.update(modifyClub);
//        int foundIndex = 0;
//        for (int i =0; i<index; i++) {
//            if(clubs[i].getId().equals(modifyClub.getId())){
//                foundIndex = i;
//                break;
//            }
//        }
//        this.clubs[foundIndex] = modifyClub;
    }
    @Override
    public void remove(String clubId) {
        this.clubStore.delete(clubId);
//        int foundIndex = 0;
//        for (int i =0; i<index; i++) {
//            if(clubs[i].getId().equals(clubId)){
//                foundIndex = i;
//                break;
//            }
//        }
//        for (int i=foundIndex; i<this.index+1; i++){
//            clubs[i] = clubs[i+1];
//        }
//        index--;
    }
}
