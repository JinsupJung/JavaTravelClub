package service;

import entity.TravelClub;

public interface ClubService {
     void register(TravelClub travelClub);
     TravelClub[] findByName(String clubName);
     TravelClub[] findAll();
     TravelClub findById(String clubId);
     void modify(TravelClub travelClub);
     void remove(String name);
}
