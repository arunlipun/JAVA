package basic_programme;

import java.util.HashMap;

public class max_freq_inString {
    public static void main(String[] args) {
        String str="apple";
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        char maxChar=' ';
        int max=0;
        for(char ch:map.keySet()){
            if(map.get(ch)>max){
                max=map.get(ch);
                maxChar=ch;
            }
        }
        System.out.println(maxChar);

    }
}
