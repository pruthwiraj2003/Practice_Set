public class Maximum_Consutive_Element {
  public static void main(String[] args){
    int [] arr = {1,1,0,0,1,1,1,0};
    int maxi = 0;
    int count =0;
    for(int i =0;i<arr.length;i++){
      if(arr[i]==1){
        count++;
        maxi = Math.max(maxi,count);
      }else{
        count =0;
      }
    }
    System.out.println(maxi);
  }
  
}
