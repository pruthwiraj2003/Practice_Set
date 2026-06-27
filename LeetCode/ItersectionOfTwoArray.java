import java .util.HashSet;
public class ItersectionOfTwoArray{
  public static void main(String[] args){
    int[]arr1 = {1,2,3,2,4,5};
    int arr2[] = {2,6,7};
    HashSet<Integer>ans = new HashSet<>();
    HashSet<Integer> result = new HashSet<>();
    for(int num :arr1){
      ans.add(num);
    }
    for(int num:arr2){
      if(ans.contains(num));
    }
    
  }
}