package util;

import java.util.Scanner;

public class ConsoleUtil {
    private Scanner scanner;
    public ConsoleUtil() {
        this.scanner = new Scanner(System.in);
    }

    public String getInputString(String label) {

        System.out.print(label + " : ");
        String str= scanner.nextLine();
        return str.trim();
    }

}
