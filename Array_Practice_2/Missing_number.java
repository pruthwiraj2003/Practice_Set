public class Missing_number {
  public static void main(String[] args) {
    int arr [] ={1 ,2, 3, 5};
    for(int i =1;i<=arr.length+1;i++){
      int flag =0;
      for(int j = 0;j<arr.length;j++){
        if(arr[j]==i){
          flag =1;
          break;
        }
      }
      if(flag ==0){
        // System.out.println(i);
      }
    }
    System.out.println(missingNumber(arr, arr.length));
  }
  static int missingNumber(int arr[],int N){
    int xor1 =0 ;
    int  xor2=0;
    int n = N -1;
    for(int i =0;i<arr.length-1;i++){
      xor2 =xor2^arr[i];
      xor1 = xor1 ^(i+1);
    }
    xor1 = xor1 ^N;
    return xor1^xor2;
  }
  
}
