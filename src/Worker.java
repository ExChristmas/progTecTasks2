import java.util.Calendar;
import java.util.GregorianCalendar;

public class Worker {

    private String surname;
    private int salary;
    private int yearOfEmployment;

    Worker () {
        this.surname = "";
        this.salary = 0;
        this.yearOfEmployment = 0;
    }

    Worker (String surname, int salary, int yearOfEmployment) {
        this.surname = surname;
        this.salary = salary;
        this.yearOfEmployment = yearOfEmployment;
    }

    public String info() {
        return "Фамилия: " + this.surname + "\nОклад: " + this.salary + "\nГод поступления на работу: " + this.yearOfEmployment;
    }

    public String experience() {
        Calendar calendar = new GregorianCalendar();
        return "Года: " + (calendar.getWeekYear() - this.yearOfEmployment) +
                "\nМесяцы: " + calendar.get(Calendar.MONTH) +
                "\nДни: " + calendar.get(Calendar.DAY_OF_MONTH);
    }

    public int numOfDaysAfterAYear() {
        Calendar calendar = new GregorianCalendar();
        int days = 0;
        int theCurrYear = calendar.getWeekYear();
        for (int i = this.yearOfEmployment + 1; i < theCurrYear; i++) {
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
                if(this.yearOfEmployment % 4 != 0 ||
                        this.yearOfEmployment % 100 == 0 && this.yearOfEmployment % 400 != 0) {
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