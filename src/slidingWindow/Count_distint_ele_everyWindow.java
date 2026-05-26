package slidingWindow;

import java.util.ArrayList;
import java.util.HashMap;

public class Count_distint_ele_everyWindow {
    public static void main(String[] args) {
        int arr[]={1,2,1,3,4,2,3};
        int k=4;
        System.out.println(countDistinct(arr,k));

    }
    static ArrayList<Integer> countDistinct(int arr[], int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if(i>=k){
                int val=arr[i-k];
                map.put(val,map.get(val)-1);
                if(map.get(val) == 0){
                    map.remove(val);
                }
            }
            if(i>=k-1){
                list.add(map.size());
            }

        }
        return list;
    }
}
