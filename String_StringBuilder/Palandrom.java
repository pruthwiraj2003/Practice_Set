public class Palandrom {
  public static void main(String[] args) {
      String str = "MADAM";
      StringBuilder sb = new StringBuilder(str);
      String str1 = sb.reverse().toString();
      System.out.println(str1);
      if(str.equals(str1)){
        System.out.println("Entered String is a Palandrom");
      }else{
        System.out.println("It is not a palndrom");
      }

  }
}
