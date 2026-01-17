// create a class Rectangle with fields length and width 
// write methods to calculate area and perimeter
//  creat object and print result 
import java.util.Scanner;
public class Rectangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    gemotery g = new gemotery();
    g.length=sc.nextDouble();
    g.width=sc.nextDouble();
    System.out.println(g.Area());
    System.out.println(g.perimeter());
  }
}
class gemotery{
  double length;
  double width;
  double Area(){
    
    return length*width;
  }
  double perimeter(){
    
    return 2*(length+width);
  }
}
