package chap04.SetMap;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Customer> map = new HashMap<>();

        map.put("aaa@aaa.com", new Customer("aaa@aaa.com", "Mike"));
        map.put("bbb@bbb.com", new Customer("bbb@bbb.com", "Jane"));
        System.out.println(map);

    }
}
