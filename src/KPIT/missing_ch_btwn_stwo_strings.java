package KPIT;

public class missing_ch_btwn_stwo_strings {
    public static void main(String[] args) {

        System.out.println(miss("abcde","abde"));

    }

    public static char miss(String s1, String s2) {
        int result=0;
        for(char ch:s1.toCharArray()){
            result^=ch;
        }
        for(char ch:s2.toCharArray()){
            result^=ch;
        }
        return (char)result;


    }
}
