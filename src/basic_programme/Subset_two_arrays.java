package basic_programme;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Subset_two_arrays {
    public static void main(String[] args) {
        int arr1[]={10, 5, 2, 23, 19};
        int arr[]={19, 5, 3};
        System.out.println(arr2_subsetof_arr1(arr1,arr));
    }
    static boolean arr2_subsetof_arr1(int arr1[],int arr2[]){
//      =============  using two pinter===========
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//        int i=0,j=0;
//        while(i<arr1.length && j<arr2.length){
//            if(arr1[i]<arr2[j]){
//                i++;
//            } else if (arr1[i]==arr2[j]) {
//                i++;
//                j++;
//
//            }else {
//                return false;
//            }
//        }
//        return j==arr2.length;

//        ========================using hashSet==========
//        HashSet<Integer>set=new HashSet<>();
//        for(int num:arr1){
//            set.add(num);
//        }
//        for(int num:arr2){
//            if(!set.contains(num)){
//                return false;
//            }
//
//        }
//        return true;

//        =================using HahMap=============
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:arr2){
            if(!map.containsKey(num)){
                return false;
            }
            map.put(num,map.get(num)-1);
        }
        return true;

    }
}
