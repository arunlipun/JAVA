public class Missing_Number {
    public static void main(String[] args) {
        int arr[]={3,0,1};
        System.out.println(missing_number(arr));

    }
    static int missing_number(int arr[]){

        int n=arr.length;
        int total=n*(n+1)/2;
        int current_sum=0;
        for(int i=0;i<arr.length;i++){
            current_sum+=arr[i];
        }
        return total-current_sum;

    }
}
