// creat an array of 5 float and calculate therir sum

public class Solving {
    public static void main(String[] args) {
        float sum [] ={5.7f,6.8f,7.0f,8.8f};
            for(int i  =0;i<sum.length;i++){
                System.out.println(sum[i]);
            }
            float add=0;
            for(int i = 0;i<sum.length;i++){
                add+=sum[i];
            }
            System.out.println("Sum of the number is "+add);
    }
    
}
