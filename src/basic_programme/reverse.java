package basic_programme;

public class reverse {
    public static void main(String[] args) {
        System.out.println(rev(1304));

    }
    static  int rev(int n){
        int reverse_num=0;
        while (n>0){
            int digit=n%10;

            reverse_num=reverse_num*10+digit;
            n=n/10;

        }
        return  reverse_num;

    }
}
