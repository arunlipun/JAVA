package Map;

import java.util.HashMap;
import java.util.Map;

public class Learn_Map {
    public static void main(String[] args) {
        //map is used to store key value pair
        Map<String,Integer> map = new HashMap<>();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
//        if(!map.containsKey("Two")){
//            map.put("Two",5);
//
//        }
//        map.put("Two",4);
//        System.out.println(map);

//        traveral in to the hashmap
        for(Map.Entry<String,Integer>em:map.entrySet()){
            System.out.println("key" + em.getKey()+"value"+ em.getValue());
        }
    }
}
