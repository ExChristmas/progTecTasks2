
public class Date {

    private int day;
    private int month;
    private int year;

    Date() {
        day = 1;
        month = 1;
        year = 2020;
    }

    Date(int year, int month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String info() {
        return this.day + "." + this.month + "." + this.year;
    }

    public void incrYear() {
        this.year++;
    }

    public void decrByTwo() {
            if (this.month == 2 || this.month == 4 || this.month == 6 ||
                    this.month == 8 || this.month == 9 || this.month == 11 ||
                    this.month == 1) {
                if (this.day == 1) {
                    this.day = 30;
                } else if (this.day == 2) {
                    this.day = 31;
                }
                if (this.month == 1) {
                    this.year--;
                    this.month = 12;
                } else {
                    this.month--;
                }
            } else if (this.month == 5 || this.month == 7 || this.month == 10 || this.month == 12) {
                if (this.day == 1) {
                    this.day = 29;
                } else if (this.day == 2) {
                    this.day = 30;
                } else {
                    this.day--;
                }
            } else if (this.month == 3) {
                if (this.year % 4 != 0 || this.year % 100 == 0 && this.year % 400 != 0) {
                    if (this.day == 1) {
                        this.day = 27;
                    } else if (this.day == 2) {
                        this.day = 28;
                    }
                } else if (this.day == 1) {
                    this.day = 28;
                } else if (this.day == 2) {
                    this.day = 29;
            }
                this.month = 2;
        } else {
                this.day -= 2;
            }
    }

    public boolean compMonthAndDay() {
        return this.day == this.month;
    }

    public void incrMonth() {
        if(this.month == 12) {
            this.month = 1;
        } else {
            this.month++;
        }
    }
}