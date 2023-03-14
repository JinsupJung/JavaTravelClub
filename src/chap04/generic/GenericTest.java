package chap04.generic;

public class GenericTest {
    public static void main(String[] args) {
        Box<Apple> box = new Box(new Apple(10));
        Apple apple = box.getItem();


    }
}
