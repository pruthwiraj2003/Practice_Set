public class Sorted {
  public static void main(String[] args) {
    int [] arr ={8,5,8,9,10};
    System.out.println(isSorted(arr));

    
  }
  static boolean isSorted(int arr[]){
    for(int i =1;i< arr.length;i++){
       if(arr[i]>=arr[i-1]){

       }else{
        return false;
       }
      }  
      return true;
    }
  }
