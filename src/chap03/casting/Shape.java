package chap03.casting;

public class Shape {
  private String type;
  public Shape(String type) {
    this.type = type;
    System.out.println("Shape type :"+type);
  }
  public String getType(){
    return this.type;
  }
  public void draw() {
    System.out.println("Drawing type :"+this.type);
  }
}
