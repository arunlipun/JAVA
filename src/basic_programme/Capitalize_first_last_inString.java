package basic_programme;

public class Capitalize_first_last_inString {
    public static void main(String[] args) {
        String str="i am a arun mohapatra";
        String[]words=str.split(" ");
        String result="";
        for(String word:words){
            if(word.length()==1){
                result+=word.toUpperCase()+ " ";
            }
            else{
                char first=Character.toUpperCase(word.charAt(0));
                char last=Character.toUpperCase(word.charAt(word.length()-1));
                String middle=word.substring(1,word.length()-1);
                result+=first+middle+last+" ";

            }
        }
        System.out.println(result.trim());
    }
}
