import java.util.*;
public class Bubble_Sort{
  public static void main(String[] args){
    int [] arr = {3,1,5,4,2};
    for(int i =1;i<arr.length;i++){
      for(int j=0;j<i;j++){
        if(arr[i]>arr[j]){
          swap(arr, arr[i],arr[j]);
        }
      }
    }
    System.out.println(Arrays.toString(arr));
}
  static void swap(int arr[], int i , int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp ;
  }
}