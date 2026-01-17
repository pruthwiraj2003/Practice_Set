
import java.util.Arrays;

public class Rotate_using_recurssion {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7};
    int k =3;
    rotate(arr, k);
    System.out.println(Arrays.toString(arr));
  }
  static void rotate(int[]arr,int k){
    int n = arr.length;
    k =k%n;
    reverse(arr, 0, k-1);
    reverse(arr, k, n-1);
    reverse(arr, 0, n-1);

  }
  static void reverse(int[] arr, int start , int end){
    if(start>=end){
      return ;
    }
    int temp =arr[start];
    arr[start]= arr[end];
    arr[end] = temp;
    reverse(arr, start+1, end-1);
  }
  // 32:00
}
