package chap04.functional;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    List<Customer> customer;

    public CustomerService() {
        this.customer = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        this.customer.add(customer);
    }
    public List<Customer> getCustomerByLocation(String location) {
        List<Customer> foundCustomers = new ArrayList<>();
        for (Customer customer : customer) {
            if(customer.getLocation().equals(location)) {
                foundCustomers.add(customer);
            }
        }
        return foundCustomers;
    }

    //인터페이스를 통한 검색 메소드
    public List<Customer> searchCustomer(SearchFilter filter) {
        List<Customer> foundCustomers = new ArrayList<>();
        for(Customer customer : customer) {
            if(filter.isMatched(customer)) {
                foundCustomers.add(customer);
            }
        }
        return foundCustomers;
    }
}
