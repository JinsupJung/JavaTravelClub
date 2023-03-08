package ui.console;

import entity.TravelClub;
import service.ClubService;
import service.ServiceLogicLifeCycler;
import util.ConsoleUtil;

public class ClubConsole {

    private ConsoleUtil consoleUtil;
    private ClubService clubService;  // 인터페이스로 받는다

    public ClubConsole() {
        this.consoleUtil = new ConsoleUtil();
//        this.clubService = new ClubServiceLogic();
        this.clubService = ServiceLogicLifeCycler.getUniqueInstance().getClubService();
    }

    public void register() {

        while (true) {
            String clubName = consoleUtil.getInputString("Club Name");
            if (clubName.equals("0")) {
                return;
            }
            String clubIntro = consoleUtil.getInputString("Intro");
            if (clubIntro.equals("0")) {
                return;
            }

            TravelClub travelClub = new TravelClub(clubName, clubIntro);
            // 배열에 저장
            clubService.register(travelClub);

            System.out.println(travelClub.toString());

        }

    }

    public void findAll() {
        TravelClub[] foundClubs = clubService.findAll();
        if (foundClubs.length == 0) {
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
            String getClubId = consoleUtil.getInputString("Finding Club Id(0:return)");
            if (getClubId.equals("0")) {
//                return;
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
        TravelClub[] foundClubs = null;

        while (true) {
            String getClubName = consoleUtil.getInputString("Finding Club Name(0:return)");
            if (getClubName.equals("0")) {
                break;
            }
            foundClubs = clubService.findByName(getClubName);
            if (foundClubs != null && foundClubs.length != 0) {
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
            String getClubId = consoleUtil.getInputString("Finding Club Id(0:return)");
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
        String getClubName = consoleUtil.getInputString("Finding Club Name(0:return)");
        if (getClubName.equals("0")) {
            return;
        }
        if(!getClubName.isEmpty()) {
            modifyClub.setClubName(getClubName);

        }
        String getClubIntro = consoleUtil.getInputString("Finding Club Intro(0:return)");
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
        String confirmYN = consoleUtil.getInputString("Remove Y or N");
        if (confirmYN.toLowerCase().equals("yes") || confirmYN.toLowerCase().equals("y")) {
            clubService.remove(targetClub.getId());
        } else {
            System.out.println("Rmove cancelled");
        }
    }
}