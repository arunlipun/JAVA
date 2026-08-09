package recursion;

public class fibonachi_series {
    public static void main(String[] args) {
        System.out.println("fibonacci series :" + fibo(10));
    }
    public static int fibo(int n){
        if(n==0)return 0;
        if(n==1)return 1;
        return fibo(n-1)+fibo(n-2);
    }
}
