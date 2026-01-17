/*
 * Problem Statement: Given an array, we have to find the smallest element in the array.

Examples:

Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 0
Explanation: 0 is the smallest element in the array. 
Given an array, we have to find the largest element in the array.

Examples

Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 5
Explanation: 5 is the largest element in the array. 

Example2: 
Input: arr[] = {8,10,5,7,9};
Output: 10
Explanation: 10 is the largest element in the array. 
 */
import java.util.Arrays;
import java.util.Scanner;
public class Smallest_Element_Array{
  public static void main(String[] args){
    Scanner  sc = new Scanner(System.in);
    int arr[] = new int[5];
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println(Arrays.toString(arr));

    int min =arr[0];
    int minInex =0;
    for(int i =0;i< arr.length;i++){
      if(arr[i]<min){
      min =arr[i];
      minInex =i;
      
      }
    }
    System.out.println(min);
    System.out.println(minInex);
    int max = arr[0];
    for(int i =0;i< arr.length;i++){
      if(arr[i]>max){
      min =arr[i];
      
      
      }
    }
    System.out.println("Maximum Element in the Array\t"+max);
  }

}