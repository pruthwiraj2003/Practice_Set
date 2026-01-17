public class Problame_01 {
    public static void main(String[] args) {
        float sum [] ={5,6,7,8};
            for(int i  =0;i<sum.length;i++){
                System.out.print(sum[i]);
            }
            float add=0;
            for(int i = 0;i<=sum.length;i++){
                add =sum[i]+sum[i+1];
            }
            System.out.println("Sum of the number is "+add);
        
    }
    
}
