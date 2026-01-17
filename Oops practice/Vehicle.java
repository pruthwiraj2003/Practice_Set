// Write a program showing constructor chaining and method overriding together.
public class Vehicle {
  String Brand;

    public Vehicle() {
      this("TATA");
    }

    public Vehicle(String Brand) {
        this.Brand = Brand;
    }
    void display(){
      System.out.println("Vehicle Brand"+Brand);
    }
    class car extends Vehicle{
      String model;

        public car(String model, String Brand) {
            super(Brand);
            this.model = model;
        }
        @Override
        void display(){
          System.out.println("Car Brand\t"+Brand+"\tModel\t"+model);
        }
      
    }
    public static void main(String[] args) {
    
    }
    
  
}
