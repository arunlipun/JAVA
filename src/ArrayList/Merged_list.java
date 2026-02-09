package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Merged_list {
    public static void main(String[] args) {
        // First sorted ArrayList
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);

        // Second sorted ArrayList
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        List<Integer> mergedList =mergeSortedLists(list1,list2);
        System.out.println("merge Sorted List");
        System.out.println(mergedList);
    }
    // Method to merge two sorted lists
    public static List<Integer> mergeSortedLists(List<Integer> l1, List<Integer> l2) {

        List<Integer> result = new ArrayList<>();

        int i = 0, j = 0;

        // Compare elements from both lists
        while (i < l1.size() && j < l2.size()) {
            if (l1.get(i) <= l2.get(j)) {
                result.add(l1.get(i));
                i++;
            } else {
                result.add(l2.get(j));
                j++;
            }
        }

        // Remaining elements of l1
        while (i < l1.size()) {
            result.add(l1.get(i));
            i++;
        }

        // Remaining elements of l2
        while (j < l2.size()) {
            result.add(l2.get(j));
            j++;
        }

        return result;
    }
}
