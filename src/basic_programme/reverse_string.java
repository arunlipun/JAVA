package basic_programme;

public class reverse_string {
    public static void main(String[] args) {
//        String  str="arun";
        System.out.println(rs("arun"));

    }
    static String  rs(String str){
        String rev=" ";
        for(int i=str.length()-1;i>=0;i--){
           rev+=str.charAt(i);
        }
        return rev;


    }
}
