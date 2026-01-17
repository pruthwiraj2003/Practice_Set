public class First_Repeating_Element {
  public static void main(String[] args) {
    int arr[] ={10,5,3,4,3,5,6};
    for(int i =0;i<arr.length;i++){
      for(int j =0;j<i;j++){
        if(arr[i]==arr[j]){
          
          System.out.println(arr[i]);
        }
      }
    }
  }
  
}
