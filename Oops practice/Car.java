// A Car class showing constructor chaining.
public class Car {
  String brand;
  String model;
  int year;

    public Car() {
      this("TATA", "Nexon", 2024);
    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    void display(){
      System.out.println("Brand\t"+brand+"\tModel\t"+model+"\tYear\t"+year);
    }
    public static void main(String[] args) {
      Car car = new Car();
      Car car2 = new Car("Audi", "s5", 2025);
      car.display();
      car2.display();
    }
    
  
}
