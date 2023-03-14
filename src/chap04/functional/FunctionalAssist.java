package chap04.functional;

import java.util.ArrayList;
import java.util.List;

public class FunctionalAssist {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        initData(service);

//        List<Customer> result = service.getCustomerByLocation("Seoul");
        List<Customer> result = new ArrayList<>();

        //새로운 요구사항이 계속 생길 경우 = 익명 클래스 이용
        result = service.searchCustomer(new SearchFilter() {
            @Override
            public boolean isMatched(Customer customer) {
                if(customer.getLocation().equals("Seoul")){
                    return true;
                } else {
                    return false;
                }
            }
        });

        // 람다 적용
        result = service.searchCustomer(customer -> customer.getLocation().equals("Seoul")&&customer.getAge()>25);

        for(Customer customer : result){
            System.out.println(customer.toString());
        }


    }

    private static void initData(CustomerService service) {
        service.addCustomer(new Customer("CUS01", "Seoul", Gender.Male, 30));
        service.addCustomer(new Customer("CUS02", "Busan", Gender.Female, 55));
        service.addCustomer(new Customer("CUS03", "Seoul", Gender.Female, 13));
        service.addCustomer(new Customer("CUS04", "Gwangju", Gender.Male, 27));
        service.addCustomer(new Customer("CUS05", "Gwangju", Gender.Female, 61));
        service.addCustomer(new Customer("CUSO6", "Incheon", Gender.Male, 29));
        service.addCustomer(new Customer("CUS07", "Seoul", Gender.Male, 42));
        service.addCustomer(new Customer("CUS08", "Seoul", Gender.Female, 45));
        service.addCustomer(new Customer("CUS09", "Seoul", Gender.Female, 33));
        service.addCustomer(new Customer("CUS010", "Busan", Gender.Male, 20));
    }
}
