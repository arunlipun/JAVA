package basic_programme;

public class noof_vowel_consonants {
    public static void main(String[] args) {
        v_c("Arun Mohapatra");

    }
    static  void v_c(String str){
        String str2=str.toLowerCase();
        int v=0,c=0;
        for(int i=0;i<str2.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' ||ch== 'e'||ch=='i'||ch=='o'||ch=='u'){
                v++;

            } else if (ch>='a'&& ch<='z') {
                c++;

            }

        }
        System.out.println("vowels are : " + v);
        System.out.println("consonants are : "+ c);
    }
}
