// Given an array of positive integers arr[] of size n, the task is to find second largest distinct element in the array.
// Given an array of n integers, the task is to find the third largest element. All the elements in the array are distinct integers. 
public class Second_Largest_Element{
  public static void main(String[] args){
    int arr[] ={6,3,2,1,8,1};
  System.out.println(Largest(arr));
  }
  static int Largest(int arr[]){
    int m = Integer.MIN_VALUE;
    int slargest = Integer.MIN_VALUE;
    int Tlargest=Integer.MIN_VALUE;
    for(int i =0;i<arr.length;i++){
      if(arr[i]>m){
        m = arr[i];
        
      }
    }
    for(int i =0;i<arr.length;i++){
      if(arr[i]>slargest&&arr[i]!=m){
        slargest=arr[i];
      }
    }
    for(int i =0;i<arr.length;i++){
      if(arr[i]>Tlargest && arr[i]<slargest){
        Tlargest = arr[i];
      }
    }

    return Tlargest;
  }
  
}