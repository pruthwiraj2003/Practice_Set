
import java.util.Arrays;

public class Rotate_Array{
  public static void main(String[] args) {
    int[] arr = {2,3,4,5,6,7,8,9};
    System.out.println(" the array "+Arrays.toString(arr));
    int temp = arr[0];
    for(int i =1;i<arr.length;i++){
      arr[i-1] = arr[i];
    }
    arr[arr.length-1] = temp;
    System.out.println("After rotating the array "+Arrays.toString(arr));
  }
}