// ind sum of first N natural numbers.
public class Sum_of_n_number {
  public static void main(String[] args) {
    System.out.println(sumofN(5));
    
  }
  static int sumofN(int n){
    if(n == 0){
      return 0;
    }

    return n+sumofN(n-1);
  }
  
}
