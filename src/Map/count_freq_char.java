package Map;

import java.util.HashMap;

public class count_freq_char {

    public static void main(String[] args) {
        String str="programming";
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);
    }
}
