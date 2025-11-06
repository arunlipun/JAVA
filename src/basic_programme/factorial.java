package basic_programme;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int f = sc.nextInt();

        long fact = 1;
        int i = 1;

        if (f == 0 || f == 1) {
            System.out.println("Factorial of " + f + " is: 1");
        } else {
            while (i <= f) {
                fact = fact * i;
                i++;
            }
            System.out.println("Factorial of " + f + " is: " + fact);
        }
    }



}

