public class Reverse_integer {
    public static void main(String[] args) {
        int n=-123;
        System.out.println(rev(n));

    }
    static int rev(int n){
        int rev=0;
        while(n!=0){
            int digit=n%10;
            if(rev>Integer.MAX_VALUE/10||rev<Integer.MIN_VALUE/10){
                return  0;
            }
            rev=rev*10+digit;
            n=n/10;
        }
        return rev;

    }
}
