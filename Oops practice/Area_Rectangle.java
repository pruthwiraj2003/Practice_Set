// Write a program to find the area of a rectangle using class and objects.
public class Area_Rectangle {
  int lenght ;
  int breadth ;
  Area_Rectangle(int l , int b){
    this.lenght=l;
    this.breadth =b;
  }
  void display(){
    System.out.println("Area of the rectangle is "+(lenght
    * breadth));
  }
  public static void main(String[] args ){
    Area_Rectangle area = new Area_Rectangle(12, 14);
    area.display();
  }
}
