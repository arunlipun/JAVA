package string;

public class multiply_string {
    public static void main(String[] args) {
//        Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
//
//        Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.
//        Example 1:
//
//        Input: num1 = "2", num2 = "3"
//        Output: "6"
//        Example 2:
//
//        Input: num1 = "123", num2 = "456"
//        Output: "56088"
//
//
//        Constraints:
//
//        1 <= num1.length, num2.length <= 200
//        num1 and num2 consist of digits only.
//                Both num1 and num2 do not contain any leading zero, except the number 0 itself.

        String a="12";
        String b="52";
        System.out.print(multiply(a,b));

    }
    static String multiply(String a, String b) {
        if(a.equals("0") && b.equals("0")){
            return "0";
        }
        int m=a.length();
        int n=b.length();
        int res[]=new int [m+n];
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                int digit1=a.charAt(i)-'0';
                int digit2=b.charAt(j)-'0';
                int product=digit1*digit2;
                int pos1=i+j;
                int pos2=i+j+1;
                int sum=product+res[pos2];
                res[pos2]=sum%10;
                res[pos1]=sum/10;

            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i:res){
            if(!(sb.length()==0 && i==0)){
                sb.append(i);
            }
        }
        return sb.toString();


    }
}
