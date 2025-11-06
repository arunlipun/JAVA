package basic_programme;
import  java.util.Arrays;

public class String_amagram {
    public static void main(String[] args) {
        String str1 = "listen";     // Step 1: Initialize str1 to "listen"
        String str2 = "silent";     // Step 2: Initialize str2 to "silent"

        if (areAnagrams(str1, str2)) {    // Step 3: Call method to check if they are anagrams
            System.out.println("Anagrams");  // Step 9a: Print "Anagrams" if true
        } else {
            System.out.println("Not Anagrams"); // Step 9b: Else print "Not Anagrams"
        }
    }

    static boolean areAnagrams(String s1, String s2) {
        s1 = s1.replaceAll("\\s", "").toLowerCase(); // Step 4: Remove spaces and convert to lowercase (unchanged here)
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if (s1.length() != s2.length()) {  // Step 5: Check lengths; if not equal, return false immediately
            return false;
        }

        char[] arr1 = s1.toCharArray();  // Step 6a: Convert string s1 to char array ['l','i','s','t','e','n']
        char[] arr2 = s2.toCharArray();  // Step 6b: Convert string s2 to char array ['s','i','l','e','n','t']

        Arrays.sort(arr1);  // Step 7a: Sort arr1 -> ['e','i','l','n','s','t']
        Arrays.sort(arr2);  // Step 7b: Sort arr2 -> ['e','i','l','n','s','t']

        // Step 8: Check if sorted char arrays are equal
        return Arrays.equals(arr1, arr2);  // Returns true because arrays match
    }
    }

