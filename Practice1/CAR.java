// creat a class car with fields : brad , speed , and a methode drive() that print the brand and speed 
//  creat multiple car objects with different values 

public class CAR {
  public static void main(String[] args) {
    car_1 c = new car_1();
    c.brand="BMW";
    c.speed=98;
    c.drive();
  }
}
class car_1 {
  String brand;
  int speed;
  void drive(){
    System.out.println("You drive "+brand+" with speed " +speed+ "  KM/hr");
  }
}

