package chap03.casting;

import java.util.Objects;

public class Rectangle extends Shape {
    private double area;

    public Rectangle(String type, double area) {
        super(type);
        this.area = area;
    }
    public double getArea() {
        return this.area;
    }
    public void draw() {
        System.out.println("Draw rectacgle :");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.area, area) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(area);
    }
}
