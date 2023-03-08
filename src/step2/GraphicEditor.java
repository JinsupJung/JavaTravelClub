package step2;

public class GraphicEditor {
    private static final int ARRAY_LENGTH = 5;
    public static void main(String[] args) {
        Shape[] shapes = new Shape[ARRAY_LENGTH];


        for(int i=0; i<ARRAY_LENGTH; i++){
            int randomNumber = (int) (Math.random()*3);

            if (randomNumber == 0) {
                shapes[i] = new Rectangle();
            } else if (randomNumber == 1 ){
                shapes[i] = new Ellipse();
            } else {
                shapes[i] = new Line();
            }
        }

        for (Shape shape : shapes) {
            if (shape instanceof Ellipse) {
                Ellipse ellip = (Ellipse) shape;
                ellip.drawEllipse();
                ((Ellipse)shape).drawEllipse();
            } else if (shape instanceof Rectangle) {
                Rectangle rect = (Rectangle) shape;
                rect.drawRectangle();
            } else {
                Line line = (Line) shape;
                line.drawLine();
            }
        }


    }
}
