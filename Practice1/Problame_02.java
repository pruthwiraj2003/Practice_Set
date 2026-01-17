// Calculate average marke of an array contening marke of all studentin physics using for each loop  

public class Problame_02 {
    public static void main(String[] args) {
        int []marks ={98,78,90,65,34,56,99};
            for(int i =0;i<marks.length;i++){
                System.out.println(marks[i]);
            }
            int sum =0;
            for(int i =0;i<marks.length;i++){
                sum+=marks[i];

            }
            System.out.println("Sum of all student marks in physics is "+sum);
    }
    
    
}
