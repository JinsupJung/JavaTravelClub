import entity.TravelClub;
import ui.menu.ClubMenu;
import util.DateUtil;

public class StoryAssistant {

    private void startStory() {
        ClubMenu clubMenu = new ClubMenu();
        clubMenu.show();
    }

    public StoryAssistant() {
    }

    public static void main(String[] args) {

        StoryAssistant storyAssistant = new StoryAssistant();

        storyAssistant.startStory();


//        TravelClub travelClub = new TravelClub("Jeju", "Nice Club");
//        System.out.println(travelClub.toString());
//
//        System.out.println(TravelClub.getSample().toString());
//        System.out.println(DateUtil.today());
    }
}

