package Date_Time_API;

import java.time.LocalDate;
import java.time.Month;

public class localdate {
    public static void main(String[] args) {
       LocalDate lc= LocalDate.now();
//        System.out.println(lc.toString());



//        LocalDate customdate=LocalDate.of(1432,5,31);
//        System.out.println(customdate.getDayOfWeek());
//        System.out.println(customdate.getDayOfMonth());



//        int day=lc.getDayOfMonth();
//        Month month=lc.getMonth();
//        int year=lc.getYear();
//        System.out.println(month);
//        System.out.println(day);
//        System.out.println(year);

        LocalDate today=LocalDate.now();
        System.out.println(today);
        LocalDate yesterday=today.minusDays(2);
        System.out.println(yesterday);
        LocalDate passdate=today.minusMonths(100);
        System.out.println(passdate);

        if(today.isAfter(yesterday)){
            System.out.println("Haan Arun");
        }
    }

}
