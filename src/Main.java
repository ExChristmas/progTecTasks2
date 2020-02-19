import java.awt.*;

public class Main {

    public static void main (String[] args) {
        // Task 1, 2
        System.out.println("Task 1, 2");
        Date date = new Date(2018, 1, 2);
        date.decrByTwo();
        System.out.println(date.info());
        date.incrYear();
        System.out.println(date.info());
        System.out.println("Совпадает ли номер месяца и  число дня: " + date.compMonthAndDay());
        date.incrMonth();
        System.out.println(date.info());

        System.out.print("\n");

        //Task 3
        System.out.println("Task 3");
        Time time = new Time(23, 59, 59);
        time.incrTimeByFiveSeconds();
        System.out.println(time.info());
        System.out.println("Количество секунд в указанном времени: " + time.numOfSeconds());

        System.out.print("\n");

        //Task 4
        System.out.println("Task 4");
        RectangleCoordinates rectangle = new RectangleCoordinates(0, 0, 5, 5);
        System.out.println(rectangle.rectangleArea());
        System.out.println(rectangle.squareCheck());
        System.out.println(rectangle.info());

        System.out.print("\n");

        //Task 5
        System.out.println("Task 5");
        Book book = new Book("Дальняя грёза", 365, 1300, 2017);
        System.out.println(book.mediumPriceOfOnePage());
        System.out.println(book.numOfDaysAfterAYear());
        System.out.println(book.info());

        System.out.print("\n");

        //Task 6
        System.out.println("Task 6");
        Worker worker = new Worker("Авраменко", 35, 2019);
        System.out.println(worker.experience());
        System.out.println(worker.numOfDaysAfterAYear());
        System.out.println(worker.info());
    }
}