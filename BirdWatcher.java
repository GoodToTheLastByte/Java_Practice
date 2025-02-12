package Exercism;

    class BirdWatcher {

        // Private attribute
        private final int[] birdsPerDay;

        // Constructor
        public BirdWatcher (int[] birdsPerDay){
            this.birdsPerDay = birdsPerDay;
        }

        public int[] getLastWeek(){
            return birdsPerDay;
        }

        public int getToday(){
            return birdsPerDay[birdsPerDay.length-1];
        }

        public void incrementTodaysCount(){
            int index = birdsPerDay.length - 1;
            System.out.println(index); 
            birdsPerDay[index] = ++birdsPerDay[index];
        }

        public boolean hasDayWithoutBirds(){

            for(int birds : birdsPerDay)
                if(birds == 0)
                    return  true;

            return false;
        }
        
        public int getCountForFirstDays(int numberOfDays){
            int  weekLimit = birdsPerDay.length;
            int birds = 0;

            for (int day=0;day<weekLimit; day++) {
                if(numberOfDays > day)
                    birds = birds + birdsPerDay[day];
            }
            
            return birds;
        }



        public int getBusyDays(){
            int busyDays = 0;

            for(int day : birdsPerDay){
                System.out.println(day);
            }
            return busyDays;
        }
        
        





}
