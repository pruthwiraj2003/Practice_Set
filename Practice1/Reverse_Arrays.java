// WAP to reverse an array 
import java.util.Arrays;
import java.util.Scanner;
public class Reverse_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int size = sc.nextInt();
        int[]arr=new int[size];
        for(int i =0;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for(int i =arr.length-1;i>=0;i--){
            System.out.print(arr[i]+ " ");   
        }
        System.out.println();
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        
    }
    
}
