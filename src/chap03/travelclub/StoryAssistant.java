package chap03.travelclub;

import chap03.travelclub.ui.menu.ClubMenu;

public class StoryAssistant {
    public static void main(String[] args) {
        StoryAssistant storyAssistant = new StoryAssistant();
        storyAssistant.startStory();
    }
    private void startStory() {
        ClubMenu clubMenu = new ClubMenu();
        clubMenu.show();
    }
}
