package basic_programme;

public class rev_string_without_Character_change {
    public static void main(String[] args) {

        String str = "Welcome to jungle";

        String[] word = str.split("\\s+");

        for(int i = word.length - 1; i >= 0; i--){
            System.out.print(word[i] + " ");
        }
    }
}