package basic_programme;

public class duplicate_in_array {
    public static void main(String[] args) {
        int arr[] = {2, 4, 3, 1, 2};
        System.out.println(find_duplicate(arr));

    }

    static int find_duplicate(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i]; // returns the first duplicate found
                }
            }

        }
        return -1;
    }
}
