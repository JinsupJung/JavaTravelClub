package chap04.SetMap;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<Integer> intSet = new HashSet<Integer>();
        for (int i = 0; i < 10000; i++) {
            intSet.add(rand.nextInt(30));
        }
        System.out.println(intSet);
    }
}
