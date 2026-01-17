
import java.util.HashSet;
import java.util.Set;

public class Union_Of_Two_Sorted_Array {
  public static void main(String[] args) {
    int arr1[] = {1 ,1,2,3,4,5};
    int arr2 [] ={2 ,3,4,4, 5,6};
    Set<Integer> set = new HashSet<>();
    for(int i =0;i<arr1.length;i++){
      set.add(arr1[i]);
    }
    for(int i =0;i<arr2.length;i++){
      set.add(arr2[i]);
    }
    int union[] = new int[set.size()];
    int index =0;
    for(int a: set){
        union[index++] =  a;
    }
    for(int x : union){
      System.out.println(x+" ");
    }
  }
  
}
