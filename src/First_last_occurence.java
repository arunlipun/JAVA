import java.util.Arrays;

public class First_last_occurence {
    public static void main(String[] args) {
        int nums[] = {5, 7, 7, 8, 8, 10};
        int target = 8;

        System.out.println(Arrays.toString(find(nums, target)));
    }

    static int[] find(int nums[], int target) {
        int res[] = new int[2];
        Arrays.fill(res, -1);

        if (nums.length == 0) {
            return res;
        }

        // 🔹 First Occurrence
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                res[0] = mid;
                end = mid - 1;   // move left
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // 🔹 Last Occurrence
        start = 0;
        end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                res[1] = mid;
                start = mid + 1; // move right
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return res;
    }
}
