package Exercism;

public class CarsAssemble {

    public static void main(String[] args){
       double result = productionRatePerHour(1);
       System.out.println(result);
       double ItemsPerMinute = workingItemsPerMinute(1);
       System.out.println(ItemsPerMinute);
    }

    public static double productionRatePerHour (int speed) {
        int standardProduction = 221;
        double successRate = 1;

        if(speed >= 5 && speed <= 8){
            successRate = 0.9;
            return speed * (standardProduction * successRate);
        } else if(speed > 8 && speed < 10) {
            successRate = 0.8;
            return speed * (standardProduction * successRate);
        } else if (speed <= 10 && speed > 9){
            successRate = 0.77;
            return speed * (standardProduction * successRate);
        } else
            return speed * standardProduction;

    }

    public static int workingItemsPerMinute(int speed){
        int result = 0;

        return result = ((int)(productionRatePerHour(speed))) / 60;

    }






}
