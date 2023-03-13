package chap03.travelclub.service;


import chap03.travelclub.entity.TravelClub;

import java.util.List;

public interface ClubService {
    public void register(TravelClub travelClub);
    public List<TravelClub> findAll();
    public List<TravelClub> findByName(String clubName);
    public TravelClub findById(String id);

    public void modify(TravelClub travelClub);
    public void remove(String id);

}
