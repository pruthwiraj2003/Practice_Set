/*
 * Problem: Given an array of N integers, move all the zeros in the array to the end while maintaining the relative order of the non-zero elements.
Example:
Input: 4 5 0 1 9 0 5 0
Output: 4 5 1 9 5 0 0 0
(This exact variant appears in past NQT questions) 
PREP INSTA
+1

Approach hints: Traverse the array, collect non-zeros in place, count zeros and append them at the end.
 */

import java.util.Arrays;

public class TCS_NQT_3 {
  public static void main(String[] args) {
    int [] arr = {4, 5,0,1,9,0,5,0};
    int j =0;
    for(int i =0;i< arr.length;i++){
      if(arr[i]!=0){
        arr[j]=arr[i];
        j++;
      }
      
    }
    // System.out.println(j);
    while(j<arr.length){
      arr[j] = 0;
      j++;
    }
    System.out.println(Arrays.toString(arr));

  }
  

  
}
