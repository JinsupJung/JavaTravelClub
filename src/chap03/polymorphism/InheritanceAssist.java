package chap03.polymorphism;

import java.util.Arrays;


public class InheritanceAssist {
    public static void main(String[] args) {
        drawShapes(new Rectangle());
        drawShapes(new Line());
        drawShapes(new Ellipse());
    }
    public static void drawShapes(Shape shape){
        shape.draw();
    }

}

//public class InheritanceAssist {
//    public static void main(String[] args) {
//        Shape[] shapes = new Shape[5];
//        shapes[0] = new Ellipse();
//        shapes[1] = new Line();
//        shapes[2] = new Rectangle();
//
//        Shape[] copyShpes = Arrays.copyOfRange(shapes, 0, 3);
//
//        for (Shape shape : copyShpes) {
//            shape.draw();
//        }
//    }
//}
