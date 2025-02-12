package Exercism;

public class Arrays {
    public static void main(String[] args){
        // Declare array with explicit size (size is 2)
        int[] twoInts = new int[2];

        // Two equivalent ways to declare and initialize an array (size is 3)
        int[] threeIntsV1 = new int[] {4,9,7};
        int[] threeIntsV2 = {4,9,7};
        
        
        double[] numbers = {1.1,2.5,7.2};
        
        int[] list = new int[10];
        
        for(int i = 0; i < 10; i++){
            list[i] = i; 
            System.out.println(list[i]); 
        }
        
        System.out.println("====================================="); 
        
        int[] list2 = new int[20];
        
        for(int i = 0; i < list2.length;i++){
            list2[i] = i + 2;
            System.out.println(list2[i]); 
        }





    }
}
