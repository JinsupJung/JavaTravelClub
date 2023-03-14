package chap03.graphiceditor.step01;

public class GraphicEditor {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Ellipse ell = new Ellipse();
        Line line = new Line();

        rect.drawRectangle();
        ell.drawEllipse();
        line.drawLine();
    }
}
