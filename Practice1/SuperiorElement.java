// A superior element is one that is greater than all elements to its right.
// Also, the rightmost element is always superior.

public class SuperiorElement {
  public static void main(String[] args) {
     int[] arr = {8, 10, 6, 2, 9, 7};
        int n = arr.length;
        System.out.println(findNumberOfSuperiorElements(arr, n));
    
  }
  static int findNumberOfSuperiorElements(int[] arr, int n){
    int c =0;
    int Rightmax = Integer.MIN_VALUE;
    for(int i =n-1;i>=0;i--){
      if(arr[i]>Rightmax){
        c++;
        Rightmax=arr[i];
      }
    }
    return c;
  }
}
