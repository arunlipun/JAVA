package basic_programme;

import java.util.HashSet;

public class remove_duplicate_fromString_firstOccurence {
    public static void main(String[] args) {
        String str="bcabc";
        HashSet<Character> set=new HashSet<>();
        String res=" ";
        for(char ch:str.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
                res+=ch;

            }
        }
        System.out.println(res);
    }
}
