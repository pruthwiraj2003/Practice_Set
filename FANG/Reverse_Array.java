
import java.util.Arrays;

// Reverse an array arr[]. Reversing an array means rearranging the elements such that the first element becomes the last, the second element becomes second last and so on.
public class Reverse_Array {
  public static void main(String[] args) {
    int arr [] ={2,3,45,67,8,9};
    System.out.println(Arrays.toString(Reverse(arr)));
  }
  static int[] Reverse(int arr[]){
    int temp[] =new int [arr.length];
    int j =0;
    for(int i = arr.length-1;i>=0;i--){
      temp[j] = arr[i];
      j++;
    } 
    return temp;
  }
  
}
