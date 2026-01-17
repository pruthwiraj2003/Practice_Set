public class Sorted {
  public static void main(String[] args) {
    int arr[]={1,2,1,3,4};
    System.out.println(isSorted(arr));
     
  }
  static boolean isSorted(int arr[]){
    for(int i =0;i<arr.length-1;i++){
      for(int j =i+1;j<arr.length;j++){
        if(arr[i]>arr[j]){
          return false;
        }
      }
    }
    return true;
  }
  
}
