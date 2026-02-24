import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
//       list.add("dnd");
       list.add(2323);
       list.add(3);
       list.add(4);
       list.add(5);
        System.out.println(list);
//        list.remove(1);
//        System.out.println(list);

//        list.clear();// this will remove all the elements from the list
//        list.set(2,40);
//        System.out.println(list);
//        list.contains(20); checks if ele present or not

//        traverse the arraylist
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        for(Integer i:list){
            System.out.println(i);
        }

        }
    }
