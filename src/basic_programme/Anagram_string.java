package basic_programme;

public class Anagram_string {
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";
        if(s1.length()!=s2.length()){
            System.out.println("Not an Anagram");
        }
        int[] freq = new int[26];

        for(char c : s1.toCharArray()){
            freq[c - 'a']++;
        }

        for(char c : s2.toCharArray()){
            freq[c - 'a']--;
        }

        for(int i : freq){
            if(i != 0){
                System.out.println("Not Anagram");
                return;
            }
        }

        System.out.println("Anagram");
    }
}




//==============shortcut================
//char[] a = s1.toCharArray();
//char[] b = s2.toCharArray();
//
//Arrays.sort(a);
//Arrays.sort(b);
//
//if(Arrays.equals(a,b))
//        System.out.println("Anagram");
//else
//        System.out.println("Not Anagram");