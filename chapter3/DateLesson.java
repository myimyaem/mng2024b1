package chapter3;
import java.time.*;

public class DateLesson {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);
        System.out.println(date1);
        System.out.println(date2);

        LocalTime time1 = LocalTime.of(6, 15); // hour and
        LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
        LocalTime time3 = LocalTime.of(6, 15, 30, 200);
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
        
        LocalDateTime ldt1 = LocalDateTime.of(2024, 4, 6, 4, 30);
        LocalDateTime ldt2 = LocalDateTime.of(2024, 4, 6, 4, 30,50);
        LocalDateTime ldt3 = LocalDateTime.of(2024, 4, 6, 4, 30,50,5000);
        System.out.println(ldt1);
        System.out.println(ldt2);
        System.out.println(ldt3);
        LocalDateTime ldt4 = LocalDateTime.of(date1,time1);
    }    
}
