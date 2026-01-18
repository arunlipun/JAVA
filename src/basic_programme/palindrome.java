package basic_programme;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(ispalindrome(120));
        System.out.println(StringPalindrome("levelm"));

    }
    static  boolean ispalindrome(int n){
        int original=n;
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        if(original==rev){
            return true;
        }
        return false;

    }

    static  boolean StringPalindrome(String text){
        int n = text.length();
        for (int i = 0; i < n / 2; i++) {
            if (text.charAt(i) != text.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;

    }
}
