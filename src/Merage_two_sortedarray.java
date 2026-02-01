public class Merage_two_sortedarray {
    public static void main(String[] args) {

        int num1[] = {1, 2, 3, 0, 0, 0};
        int num2[] = {2, 5, 6};

        int m = 3;
        int n = 3;

        merge(num1, num2, m, n);

        // print merged array
        for(int i = 0; i < m + n; i++){
            System.out.print(num1[i] + " ");
        }
    }

    static void merge(int num1[], int num2[], int m, int n){
        int i = m - 1;
        int j = n - 1;
        int x = m + n - 1;

        while(i >= 0 && j >= 0){
            if(num1[i] > num2[j]){
                num1[x] = num1[i];
                i--;
            } else {
                num1[x] = num2[j];
                j--;
            }
            x--;
        }

        while(j >= 0){
            num1[x] = num2[j];
            j--;
            x--;
        }
    }
}
