import java.util.Arrays;

public class MergeTwoSortedArray{
  public static void main(String[] args) {

    int [] num1 = {1,2,3,0,0,0};
    int [] num2 ={2,5,6};
    int m = 3;
    int n = 3;

    // for(int i =0;i<num2.length;i++){
      // num1[m+i]=num2[i];
    // }

    // Arrays.sort(num1);

    // System.out.println(Arrays.toString(num1));

    SortedArray(num1, m, num2, n);
  }

  static void SortedArray(int num1[], int m , int num2[], int n ){

    int temp[] = new  int[m+n];
    int i =0;int j =0; int k =0;
    while(i<m&&j<n){
      if(num1[i]<=num2[j]){
        temp[k]=num1[i];
        i++;
      }else{
        temp[k] = num2[j];

        j++;
      }
      k++;
    }

    while(i<m){
      temp[k]=num1[i];
      i++;
      k++;


    }
    while(j<n){
      temp[k] = num2[j];
            j++;
            k++;
    }
    
    for(int x =0;x<m+n;x++){
      num1[x] = temp[x];
    }

    System.out.println(Arrays.toString(num1));

  }
}