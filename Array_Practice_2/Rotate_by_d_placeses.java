import java.util.Arrays;

public class Rotate_by_d_placeses {
  public static void main(String[] args) {
    int d = 3;
    int [] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));

    int [] temp =new int[d];
    for(int i =0;i<d;i++){
      temp[i] = arr[i];
    }
    System.out.println(Arrays.toString(temp));

    for(int i =d;i<arr.length;i++){
      arr[i-d] = arr[i];

    }
    int j =0;
    for(int i =arr.length-d;i<arr.length;i++ ){
      arr[i] =temp[j];
      j++;
    }
    System.out.println(Arrays.toString(arr));
    
  }
  static void reverse(int arr[]){

  }
  
} 
// 25:26
