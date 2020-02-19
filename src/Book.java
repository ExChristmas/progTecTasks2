import java.util.Calendar;
import java.util.GregorianCalendar;

public class Book {

    private String name;
    private int numberOfPages;
    private double price;
    private int year;

    Book () {
        this.name = "";
        this.numberOfPages = 0;
        this.price = 0.0;
        this.year = 2000;
    }

    Book (String name, int numberOfPages, double price, int year) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.year = year;
    }

    public String info() {
        return "Название: " + this.name + "\nКоличество страниц: " + this.numberOfPages +
                "\nЦена: " + this.price + "\nГод издания: " + this.year;
    }

    public double mediumPriceOfOnePage () {
        return this.price / this.numberOfPages;
    }

    public int numOfDaysAfterAYear () {
        Calendar calendar = new GregorianCalendar();
        int days = 0;
        int theCurrYear = calendar.getWeekYear();
        for (int i = this.year + 1; i < theCurrYear; i++) {
            if (i % 4 != 0 || i % 100 == 0 && i % 400 != 0) {
                days += 365;
            } else {
                days += 366;
            }
        }
        for (int i = 1; i < calendar.get(Calendar.MONTH) + 1; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 ||
            i == 8 || i == 10) {
                days += 31;
            } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                days += 30;
            } else if (i == 2) {
                if(this.year % 4 != 0 || this.year % 100 == 0 && this.year % 400 != 0) {
                    days += 28;
                } else {
                    days += 29;
                }
            }
        }
        days += calendar.get(Calendar.DAY_OF_MONTH) - 1;
        return days;
    }

}