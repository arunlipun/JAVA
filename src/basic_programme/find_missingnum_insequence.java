package basic_programme;

public class find_missingnum_insequence {
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        System.out.println(missing(arr,5));

    }
    static int missing(int arr[],int n){
        int sum=0;
        int total=n*(n+1)/2;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];


        }
        int num=total-sum;
        return num;
    }
}
