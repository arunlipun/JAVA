package list.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class copyonwrite_arraylist {
    public static void main(String[] args) {
//        List<String >list=new ArrayList<>();
//        if we write copyonwrite then ok..else showing exceptions

        List<String >list=new CopyOnWriteArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println("initial shopping list" + list);
        for(String item:list){
            System.out.println(item);
            if(item.equals("a")){
                list.add("amul");
                System.out.println("Added amul");

            }
        }
        System.out.println("Updated List is added "+ list);
    }
}
