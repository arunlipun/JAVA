package Date_Time_API;

import java.time.LocalTime;

public class localtime {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime customtime=LocalTime.of(14,23,21);
        System.out.println(customtime);


        LocalTime beforeOneHour=now. minusHours(4);
        System.out.println(beforeOneHour);

        if(now.isAfter(beforeOneHour)){
            System.out.println("Haan Arun");
        }
    }
}
