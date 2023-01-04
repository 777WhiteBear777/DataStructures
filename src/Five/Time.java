package Five;

public class Time {
    private long timeBefore;
    private long timeAfter;

    public void setTimeBefore(long timeBefore) {
        this.timeBefore = timeBefore;
    }

    public void setTimeAfter(long timeAfter) {
        this.timeAfter = timeAfter;
    }

    public void difference(){
        System.out.println("Time: " + (timeAfter - timeBefore));
    }
}
