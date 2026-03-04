package basic_programme;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Remove_duplicate_unsortedarray {
    public static void main(String[] args) {
        int arr[] = {4, 2, 5, 2, 3, 4, 1};

        int[] result = rdu(arr);

        System.out.println(Arrays.toString(result));

    }
    static  int[]  rdu(int arr[]){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(int num:arr){
            set.add(num);
        }
        int result[]=new int [set.size()];
        int i=0;
        for(int num:set){
            result[i++]=num;
        }
        return result;

    }

}
