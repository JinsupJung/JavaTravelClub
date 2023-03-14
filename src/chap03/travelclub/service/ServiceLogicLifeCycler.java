package chap03.travelclub.service;

import chap03.travelclub.service.logic.ClubServiceLogic;

public class ServiceLogicLifeCycler {
    private static ServiceLogicLifeCycler uniqueInstance;
    private ClubService clubService;

    public ServiceLogicLifeCycler() {
        this.clubService = new ClubServiceLogic();
    }

    public static ServiceLogicLifeCycler getUniqueInstance() {
        if (uniqueInstance==null) {
            uniqueInstance = new ServiceLogicLifeCycler();
        }
        return uniqueInstance;
    }
    public ClubService getClubService() {
        return this.clubService;
    }
}
