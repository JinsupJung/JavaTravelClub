package chap04.SetMap;

import java.util.HashSet;
import java.util.Set;

public class CustomerSet {
    public static void main(String[] args) {
        Set<Customer> customerSet = new HashSet<>();

        Customer customer = new Customer("aaa@aaa.com", "Mike");
        customerSet.add(customer);
        customerSet.add(customer);
        System.out.println(customerSet.size());
        customerSet.add(new Customer("aaa@aaa.com", "Mike"));  // 같다라는 로직을 클래스에 정의 해야 된다
        System.out.println(customerSet.size());
        customerSet.add(new Customer("bbb@bbb.com", "Jane"));
        System.out.println(customerSet.size());
    }
}
