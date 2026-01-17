// Recursion : - when a function call itself until a specified condition is met 
// StackOverflow : - 
// Base condition : - the condition we use to stop the calling of function 
// Print names 5 ttimes 

public class Introduction{
  public static void main(String[] args) {
    name(5);
    
  }
  static void name(int n){
    if(n>0) {
      System.out.println("pruthwiraj MAhapatra");
      name(n-1);

    }
  }
}