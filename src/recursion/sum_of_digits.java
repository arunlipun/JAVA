package recursion;

public class sum_of_digits {
    public static void main(String[] args) {
        System.out.println("Sum of digits are : " + sum(123));

    }
    public static int sum(int n){
        if(n==0)return 0;
        return (n%10)+sum(n/10);
    }
}
