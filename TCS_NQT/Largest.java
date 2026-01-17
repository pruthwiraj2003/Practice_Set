public class Largest {
  public static void main(String[] args) {
      int arr[] ={4, 2, 6, 7, 1, 8, 9}; 
      int largest =arr[0];
      for(int i =0;i<arr.length;i++){
        if(arr[i]>largest){
          largest =arr[i];
        }
      }
      System.out.println("The Largest Element "+largest);
      int slargest = Integer.MIN_VALUE;
      for(int i =0;i< arr.length;i++){
        if(arr[i]>slargest && arr[i]<largest){
          slargest=arr[i];
        }
      }
      System.out.println("Second largest is "+slargest);           
  }
}