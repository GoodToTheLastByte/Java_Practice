

package Exercism;


import java.util.Random;

public class ExampleRandom {
    public static void main(String[] args){

        Random random = new Random();

        // Default range is Min Max of data type integer
        int  x = random.nextInt();
        System.out.println(x);

        int y = random.nextInt(20);
        System.out.println(y);
        
        // Simpler with Math.random
        double randomNumber = Math.random();
        System.out.println(randomNumber); 
        
        // Can also get double value from random class
        Random myRandomNumber = new Random();
        
        myRandomNumber.nextDouble();
        
        System.out.println(myRandomNumber); 
        




    }
}
