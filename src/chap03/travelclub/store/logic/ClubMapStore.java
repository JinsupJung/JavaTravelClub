package chap03.travelclub.store.logic;

import chap03.travelclub.entity.TravelClub;
import chap03.travelclub.store.ClubStore;

import java.util.*;

public class ClubMapStore implements ClubStore {
    private Map<String, TravelClub> clubMap;

    public ClubMapStore() {
        this.clubMap = new HashMap<>();
    }

    @Override
    public void create(TravelClub travelClub) {
        clubMap.put(travelClub.getId(), travelClub);

    }

    @Override
    public TravelClub retrieve(String clubId) {
        return this.clubMap.get(clubId);
    }

    @Override
    public List<TravelClub> retrieveAllByName(String clubName) {
        List<TravelClub> foundClub = new ArrayList<>();
        // 1. forEach 구문으로
        for (TravelClub club : this.clubMap.values()) {  //values() 메소드로 collection 객체로 반환 받는다
                if (club.getClubName().equals(clubName)) {
                    foundClub.add(club);
                }
        }
        // 2. iterator를 이용
//        Iterator<TravelClub> iterator = this.clubMap.values().iterator();
//        while (iterator.hasNext()) {
//            TravelClub club = iterator.next();
//            if (club.getClubName().equals(clubName)) {
//                foundClub.add(club);
//            }
//        }
        return foundClub;
    }

    @Override
    public List<TravelClub> retrieveAll() {
        return new ArrayList<>(this.clubMap.values());
    }

    @Override
    public void update(TravelClub updateClub) {
        this.clubMap.put(updateClub.getId(), updateClub);
    }

    @Override
    public void delete(String clubId) {
        this.clubMap.remove(clubId);
    }
}
