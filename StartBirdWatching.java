package Exercism;

public class StartBirdWatching {
    public static void main(String[] args){
        int[] birdCount = {0,2,5,3,7,8,4,1};
        
        BirdWatcher birdWatcher = new BirdWatcher(birdCount);
        
        System.out.println(birdWatcher.getLastWeek()[1]);

        System.out.println(birdWatcher.getToday());

       // birdWatcher.incrementTodaysCount();

        System.out.println(birdWatcher.getToday());
        
        System.out.println(birdWatcher.hasDayWithoutBirds());
        
       // System.out.println(birdWatcher.getCountForFirstDays(8));
        
        System.out.println(birdWatcher.getBusyDays());
    }
}
