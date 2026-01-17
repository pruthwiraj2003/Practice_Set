// WAP to chacek whether an intiger in the given array or not
import java.util.Scanner;
public class Solving_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr ={45,78,90,43,98};
        
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Enter your Number");
        int key=sc.nextInt();
        for(int i =0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Your Number found at index "+i);
                break;
            }
        }
        

    }
    
}
