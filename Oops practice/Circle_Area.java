// A Circle class with constructor to calculate area.
public class Circle_Area {
  double PI ;
  double radius ;

    public Circle_Area(double PI , double  radius) {
      this.PI = PI;
      this.radius = radius;
    }
     double display(){

      return PI*radius*radius;
    }
    public static void main(String[] args) {
      Circle_Area circle = new Circle_Area(3.0 ,7.0);
      System.out.println(circle.display());
    }
  
  
}
