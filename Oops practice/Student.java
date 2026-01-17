// Write a Java class Student with data members name, rollNo, and marks, and a method display() to print them.
public class Student{
  String Name;
  Long rollNo;
  double marks;
  void Display(){
    System.out.println("Name of the student "+Name+" RollNo:-"+rollNo+" Marks"+marks);
  }
  public static void main(String[] args) {
      Student s = new Student();
      s.Name = "Aditya";
      s.rollNo= 2401090063l;
      s.marks=82.5;
      Student s2 = new Student();
      s2.Name= "Amar";
      s2.rollNo=123456l;
      s2.marks=90;
      s.Display();
      s2.Display();
  }
}