// Given an integer Array  nums of size n. return the majority element 
public class Majority_Element {
  public static void main(String[] args) {
    int nums[] = {1,2,2,3,3,4,4,3};
    int count =0;
    int candidate = 0;
    for(int num : nums){
      if(count ==0){
        candidate = num;
      }
      if(num ==candidate){
        count++;
      }else {
        count--;
      }
    }
    System.out.println(candidate);
  }
}
