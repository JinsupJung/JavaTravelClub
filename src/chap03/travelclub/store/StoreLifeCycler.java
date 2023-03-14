package chap03.travelclub.store;

import chap03.travelclub.service.ClubService;
import chap03.travelclub.service.ServiceLogicLifeCycler;
import chap03.travelclub.service.logic.ClubServiceLogic;
import chap03.travelclub.store.logic.ClubMapStore;

public class StoreLifeCycler {
    private static StoreLifeCycler uniqueStoreInstance;
    private ClubStore clubStore;

    public StoreLifeCycler() {
        this.clubStore = new ClubMapStore();
    }

    public static StoreLifeCycler getUniqueInstance() {
        if (uniqueStoreInstance==null) {
            uniqueStoreInstance = new StoreLifeCycler();
        }
        return uniqueStoreInstance;
    }
    public ClubStore requestClubStore() {
        return this.clubStore;
    }
}
