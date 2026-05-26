package Date_Time_API;

import java.time.LocalDate;
import java.time.Period;

public class period {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();

        LocalDate then = LocalDate.of(1990, 2, 28);

        Period period = Period.between(then, now);

        System.out.println("Years : " + period.getYears());
        System.out.println("Months : " + period.getMonths());
        System.out.println("Days : " + period.getDays());
    }
}