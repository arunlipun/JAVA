package basic_programme;

public class Remove_Character {
    public static void main(String[] args) {
        String str="abc!#2dci$kd ^8VuyK";
        String str1="a+((b+c)+d)";
        String res1=str1.replaceAll("[()]"," ");
        String res=str.replaceAll("[^a-zA-Z]"," ");
        System.out.println(res);
        System.out.println(res1);
    }
}
