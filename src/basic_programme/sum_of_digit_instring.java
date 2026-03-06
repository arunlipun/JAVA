package basic_programme;

public class sum_of_digit_instring {
    public static void main(String[] args) {
        String str="1xy5z23";
        int sum=0,num=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }else {
                sum+=num;
                num=0;
            }
        }
        sum+=num;
        System.out.println(sum);
    }
}
