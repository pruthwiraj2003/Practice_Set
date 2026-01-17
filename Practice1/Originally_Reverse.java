// WAP to revress An array originally

import java.util.Scanner;

public class Originally_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int size = sc.nextInt();
        int[]arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);

        }
        int l=arr.length-1;
        int f=0;
        System.out.println();
        for(int i =0;i<=arr.length/2;i++){
            int temp=arr[f];
            arr[f]=arr[l];
            arr[l]=temp;
            System.out.print(arr[i]+" ");  

        }



    }
    
}
