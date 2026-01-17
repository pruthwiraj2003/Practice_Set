// Creat a class with fields : name ,rollNo ,. and a method display() 
// creat two student object and display their details 

public class Student_Details{
  public static void main(String[] args){
    Student S1 = new Student();
    S1.name= "Amar";
    S1.rollno = 234;
    S1.display();
    Student S2 = new Student();
    S2.name ="LUCKY";
    S2.rollno =235;
    S2.display();
  }
}
class Student{
  String name ;
  int  rollno;
  void  display(){
    System.out.println("Name :" +name);
    System.out.println("Roll no "+rollno);
  }

}