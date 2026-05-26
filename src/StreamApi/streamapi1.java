package StreamApi;


// Stream api is used if we want to process an object from collections , then we should use stram api.

// Collections to stream

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

//Stream s= collection.stream()

public class streamapi1 {
    public static void main(String[] args) {
//        find the even no from array using stream api
        List<Integer> list= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        List<Integer> filteredList=list.stream().filter(i -> i%2==0).toList();
//        System.out.println(filteredList);


//        multiply each element from list ...(we should map)
//        map is transform the data


//        List<Integer> transformed2List=list.stream().map(i-> i*2).toList();
//        System.out.println(transformed2List);


//        add 5 grace marks 5 for failed  students
//        List<Integer> list1= Arrays.asList(51, 32, 93, 14, 65, 26, 37, 78, 8, 30);
//        List<Integer>passed=list1.stream().filter(i->i>30).toList();
//        System.out.println(passed);
//
//        List<Integer> gracemark=list1.stream().filter(i->i<30).map(j->j+5).toList();
//        System.out.println(gracemark);


//        to convert array to stream
       int []arr={1,2,3,4,5,6,7,8,9};
       Arrays.stream(arr).filter(i->i % 2==0).forEach(System.out::println);


    }
}
