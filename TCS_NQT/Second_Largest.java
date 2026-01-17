

public class Second_Largest {
  public static void main(String[] args) {
    int arr[]={1, 2, 3,6,7};
    int min =arr[0];
    int max = -1;
    for(int i =0;i<arr.length;i++){
      if(arr[i]<min && arr[i]>max){
        min = arr[i];
        max = arr[i];
      }
    }
    System.out.println(min);
    System.out.println(max);
  }
  
}
