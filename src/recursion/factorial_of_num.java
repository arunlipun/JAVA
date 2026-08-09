package recursion;

public class factorial_of_num {
    public static void main(String[] args) {
        System.out.println("factorial of num : "+ fact(1));

    }
    public static int  fact(int n){
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }
}
