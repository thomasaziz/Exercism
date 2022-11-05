
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        int lastElement = birdsPerDay.length;

        if (lastElement > 0){
            return birdsPerDay[lastElement-1];
        }
        else{
            return 0;
        }
        
    }

    public void incrementTodaysCount() {
        int currentCount = getToday();

        int lastElement = birdsPerDay.length;
        birdsPerDay[lastElement-1] = ++currentCount;
    }

    public boolean hasDayWithoutBirds() {
        for (int i = 0; i < birdsPerDay.length; i++){
            if (birdsPerDay[i] == 0){
                return true;
            }
        }

        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int totalCount = 0;

        if (numberOfDays > birdsPerDay.length){
            numberOfDays = birdsPerDay.length;
        }
        
        for (int i = 0; i < numberOfDays; i++){
            totalCount += birdsPerDay[i];
        }

        return totalCount;
    }

    public int getBusyDays() {
        int busyDays = 0;

        for (int i = 0; i < birdsPerDay.length; i++){
            if (birdsPerDay[i] >= 5){
                busyDays++;
            }
        }

        return busyDays;
    }
}
