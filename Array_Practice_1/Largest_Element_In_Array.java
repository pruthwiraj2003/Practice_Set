public class Largest_Element_In_Array {
  public static void main(String[] args) {
    int arr[] ={2,4,1,5,6,7,8};
    System.out.println(largest(arr));
      
  }
  static int largest(int arr[]){
    int max =arr[0];
    for(int i =0;i<arr.length;i++){
      if(arr[i]>max){
        max = arr[i];
      }
    }

    int slargest =-1;

    for(int i =0;i<arr.length;i++){
      if(arr[i]>slargest && arr[i]!=max){
        slargest = arr[i];
      }

    }

    return slargest;
    
  }
  
  
}
