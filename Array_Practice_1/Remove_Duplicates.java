
import java.util.ArrayList;

public class Remove_Duplicates {
  public static void main(String[] args) {
    int arr[] ={1,2,3,3,4,5,5};
    int arr2[] ={3,1,4,2,3,5,1};
    System.out.println(RemoveDuplicates(arr));
    System.out.println(duplicates(arr2));
    
  }
  static ArrayList<Integer> RemoveDuplicates(int arr[]){
    ArrayList<Integer>list = new ArrayList<>();
    for(int i =0;i<arr.length-1;i++){
      if(arr[i]==arr[i+1]){
        list.add(arr[i]);
      }
    }
    return list;
  }
  static ArrayList<Integer> duplicates(int arr[]){
    ArrayList<Integer>list = new ArrayList<>();
    for(int i =0;i<arr.length;i++){
      for(int j =0;j<i;j++){
        if(arr[i]==arr[j]){
          if(!list.contains(arr[i])){
            list.add(arr[i]);
          }
          break;
        }  
      }
    }
    return list;
  }
  
}
