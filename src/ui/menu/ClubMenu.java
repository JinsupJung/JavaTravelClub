package ui.menu;

import ui.console.ClubConsole;

import java.util.Scanner;

public class ClubMenu {
    private Scanner scanner;
    private ClubConsole clubConsole;

    public ClubMenu() {
        this.scanner = new Scanner(System.in);
        this.clubConsole = new ClubConsole();
    }

    public void show() {
        int menuNumber = 0;


        while (true) {
            displayMenu();
            menuNumber = selectMenu();

            switch (menuNumber) {
                case 1:
                    clubConsole.register();
                    break;
                case 2:
                    clubConsole.findAll();
                    break;
                case 3:
                    clubConsole.findById();
                    break;
                case 4:
                    clubConsole.findByName();
                    break;
                case 5:
                    clubConsole.modify();
                    break;
                case 6:
                    clubConsole.remove();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Choose menu ");
            }
        }
    }
    private void displayMenu() {
        System.out.println("----------------------");
        System.out.println("Club Menu");
        System.out.println("----------------------");
        System.out.println("1. Register");
        System.out.println("2. FindAll");
        System.out.println("3. Find(Id)");
        System.out.println("4. Find(Name)");
        System.out.println("5. Modify");
        System.out.println("6. Remove");
        System.out.println("----------------------");
        System.out.println("0. Previous");
        System.out.println("----------------------");
    }
    private int selectMenu() {
        int menuNumber = 0;

        System.out.print("Select Menu : ");
        menuNumber = scanner.nextInt();

        if (menuNumber < 0 || menuNumber>6){
            System.out.println("Choice is not valid");
            return -1;
        } else {
            scanner.nextLine(); // 입력 버퍼를 클리어
            return menuNumber;
        }

    }
}
