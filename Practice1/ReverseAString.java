public class ReverseAString{
  public static void main(String[] args){
    String str = "ANITA";
    String reverse ="";
    for(int i = str.length()-1;i>=0;i--){
      reverse =reverse + str.charAt(i);
    }
    
    System.out.println("Original String "+str);
    System.out.println("reverse  String "+reverse);
    String str1 ="Hello Java Developers";
    StringBuilder sb = new StringBuilder(str1);
    String reverse1 =sb.reverse().toString();
    System.out.println(str1);
    System.out.println(reverse1);

  }
  
}