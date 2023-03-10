package chap03.inheritance;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name) {
//        this.name = name;
        super(name);
    }

    public double getBonus() {
        return this.bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalary(){
        return (super.getSalary() + bonus);
    }

    public String getManagerName() {
        return this.getName();   // == super.getName()과 같다
    }
}
