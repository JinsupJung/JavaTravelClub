package chap01;

public class FistJava {
    public static void main(String[] args) {
        //지역변수는 접근제어자 없음
        Employee employee = new Employee("mike", "sales");
        employee.work();
        System.out.println(employee.toString());;
    }
}
