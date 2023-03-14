package chap03.graphiceditor.step03;

public class GraphicEditor {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        int index = 0;

        for (int i=0; i<5; i++){
            int randomNumber = (int)(Math.random()*3);
            switch (randomNumber) {
                case 0:
                    shapes[i] = new Rectangle();
                    break;
                case 1:
                    shapes[i] = new Ellipse();
                    break;
                case 2:
                    shapes[i]= new Line();
                    break;
                default:
                    break;
            }
        }
        for(Shape shape : shapes) {
            shape.draw();
            System.out.println(shape.toString());
        }


    }
}
