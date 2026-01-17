/*
 * Count elements greater than all previous elements

Problem: Given an array Arr[] of size N, count how many elements are strictly greater than all of its prior elements (the first element counts).
Example:
Input: 7 4 8 2 9
Output: 3 (7, 8, 9)
(This one is also referenced in past NQT question sheets) 
PREP INSTA
+1

Approach hints: Keep track of the current maximum while iterating and increase count when the current element > current maximum.
 */

public class TCS_NQT_4 {
  public static void main(String[] args) {
    int [] arr ={7 , 4, 8, 2, 9};
    int currentMax =arr[0];
    int count =1;
    for(int i =0;i< arr.length;i++){
      if(arr[i]>currentMax){
        count++;
        currentMax =arr[i];
      }
      
    }
    System.out.println("count ="+count);
  }
}
