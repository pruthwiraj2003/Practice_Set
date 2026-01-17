class Pen{
  String color;
  String type;  // ballpoint,gel

  public void write(){
    System.out.println("Writing something");
  }
  // public void printcolor(){
  //   System.out.println(this.color);
  // }
}
class Student{
  String name ;
  int age;
  // int Roll_no;
  public void  printname(){
    System.out.println(this.name);
    System.out.println(this.age);
  }
  Student(String name,int Age){
    this.name = name;
    this.age = age;
  }
  
}

public class OOPS{
  public static void main(String[] args) {
    // Pen pen1=new Pen();
    // pen1.color ="blue";
    // pen1.type = "gel";

    // pen1.write();
    // Pen pen2 = new Pen();
    // pen2.color ="black";
    // pen2.type ="ballpoint";

    // pen1.printcolor();
    // pen2.printcolor();

    Student A = new Student("Amar",23);
    
    A.printname();
  }

}