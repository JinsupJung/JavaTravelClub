package chap03.travelclub.ui.console;


import chap03.travelclub.entity.TravelClub;
import chap03.travelclub.service.ClubService;
import chap03.travelclub.service.ServiceLogicLifeCycler;
import chap03.travelclub.service.logic.ClubServiceLogic;
import chap03.travelclub.util.ConsoleUtil;

import java.util.List;

public class ClubConsole {
    private ConsoleUtil consoleUtil;
    private ClubService clubService;  // 인터페이스로 받는다

    public ClubConsole() {
        this.consoleUtil = new ConsoleUtil();
        // 변경될 로직
//        this.clubService = new ClubServiceLogic();
        this.clubService = ServiceLogicLifeCycler.getUniqueInstance().getClubService();
    }

    public void register() {
        while (true) {
            String clubName = consoleUtil.getValueOf("Club Name");
            if (clubName.equals("0")) {
                return;
            }
            String clubIntro = consoleUtil.getValueOf("Intro");
            if (clubIntro.equals("0")) {
                return;
            }
            TravelClub newClub = new TravelClub(clubName, clubIntro);
            // 배열에 저장
            clubService.register(newClub);
            System.out.println(newClub.toString());
        }
    }

    public void findAll() {
        List<TravelClub> foundClubs = clubService.findAll();
        if (foundClubs.isEmpty()) {
            System.out.println("Club empty");
            return;
        }
        for (TravelClub club : foundClubs) {
            System.out.println(club.toString());
        }
    }

    public void findById() {
        TravelClub foundClub = null;

        while (true) {
            String getClubId = consoleUtil.getValueOf("Finding Club Id(0:return)");
            if (getClubId.equals("0")) {
                break;
            }
            foundClub = clubService.findById(getClubId);
            if (foundClub != null) {
                System.out.println("Found club is : " + foundClub.toString());

            } else {
                System.out.println("Cannot found club");
            }
        }
    }

    public void findByName() {
        List<TravelClub> foundClubs;

        while (true) {
            String getClubName = consoleUtil.getValueOf("Finding Club Name(0:return)");
            if (getClubName.equals("0")) {
                break;
            }
            foundClubs = clubService.findByName(getClubName);

            if (foundClubs!=null&&!foundClubs.isEmpty()) {
                for (TravelClub club : foundClubs) {
                    System.out.println("Found club is : " + club.toString());
                }
            } else {
                System.out.println("Cannot found club");
            }
        }
    }

    private TravelClub findOne() {
        TravelClub foundClub = null;

        while (true) {
            String getClubId = consoleUtil.getValueOf("Finding Club Id(0:return)");
            if (getClubId.equals("0")) {
                break;
            }
            foundClub = clubService.findById(getClubId);

            if (foundClub!=null){
                break;
            } else {
                System.out.println("Not found club"+getClubId);
            }

        }
        return foundClub;

    }

    public void modify() {
        TravelClub modifyClub = findOne();
        String getClubName = consoleUtil.getValueOf("Finding Club Name(0:return)");
        if (getClubName.equals("0")) {
            return;
        }
        if(!getClubName.isEmpty()) {
            modifyClub.setClubName(getClubName);

        }
        String getClubIntro = consoleUtil.getValueOf("Finding Club Intro(0:return)");
        if (getClubIntro.equals("0")) {
            return;
        }
        if (!getClubIntro.isEmpty()) {
            modifyClub.setIntro(getClubIntro);

        }
        clubService.modify(modifyClub);

        System.out.println("Modified club :" + modifyClub);
    }

    public void remove() {
        TravelClub targetClub = findOne();
        String confirmYN = consoleUtil.getValueOf("Remove this club(Y:yes or N:no");
        if (confirmYN.toLowerCase().equals("yes") || confirmYN.toLowerCase().equals("y")) {
            clubService.remove(targetClub.getId());
        } else {
            System.out.println("Rmove cancelled");
        }
    }
}
