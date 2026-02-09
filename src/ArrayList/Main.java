package ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(654656);
        list.add(57);
        list.add(68);
//        for(int x:list){
//            System.out.println(x);
//        }

        list.set(2,100);
        System.out.println(list);

//        // ArrayList → Array
//        Integer[] arr = list.toArray(new Integer[0]);
//
//// Array → ArrayList
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

    }
}
