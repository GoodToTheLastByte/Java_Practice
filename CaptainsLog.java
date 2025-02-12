package Exercism;

import java.util.Random;
public class CaptainsLog {
    private static final char[] PLANET_CLASSES = {'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};
    private Random random;

    CaptainsLog(Random random){
        this.random = random;
    }

    char randomPlanetClass(){
        return PLANET_CLASSES[random.nextInt(PLANET_CLASSES.length)];
    }

    String randomShipRegistryNumber(){
        return "NCC-" + random.nextInt(1000,9999);
    }


    double generateRandomStarDate(){
        return random.nextDouble(41000,42000);
    }


    public static void main(String[] args){
        Random random = new Random();
        CaptainsLog myLog = new CaptainsLog(random);
        
        System.out.println(myLog.randomPlanetClass());
        System.out.println(myLog.randomShipRegistryNumber());

        double starDate = myLog.generateRandomStarDate();

        System.out.printf("Star Date : %5.2f",starDate);
        
        
    }

}
