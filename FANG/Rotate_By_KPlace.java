
import java.util.Arrays;

// Given an array arr[] and an integer k, find the array after reversing every subarray of consecutive k elements in place. If the last subarray has fewer than k elements, reverse it as it is. Modify the array in place, do not return anything.
public class Rotate_By_KPlace {
  public static void main(String[] args) {
    int arr [] = {1,2,3,4,5,6};
    int k = 3;
    int j =0;
    int temp[] = new int [arr.length]; 
    for(int i=k-1;i>=0;i--){
      temp[j]=arr[i];
      j++;
    }
    for(int i = arr.length-1;i>=arr.length-k;i--){
      temp[j] = arr[i];
      j++;
    }
    System.out.println(Arrays.toString(temp));

  }
}
