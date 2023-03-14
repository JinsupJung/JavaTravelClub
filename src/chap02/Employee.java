package chap02;

public class Employee {
    private String id;
    private String name;
    private String department;

    public Employee(String id) {
        this.id = id;
    }
    public Employee(String id, String department) {
        this(id);
        this.department = department;
    }

    public Employee(String id, String name, String department) {
        this(id, name);
        this.department = department;
    }
}
