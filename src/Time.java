
public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    Time () {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public String info() {
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }

    public int numOfSeconds () {
        return this.hours * 3600 + this.minutes * 60 + this.seconds;
    }

    public void incrTimeByFiveSeconds () {
        this.seconds += 5;
        if (this.seconds > 59) {
            this.seconds %= 10;
            if (this.minutes == 59) {
                this.minutes = 0;
                if (this.hours == 23) {
                    this.hours = 0;
                }
            }
        }
    }
}
