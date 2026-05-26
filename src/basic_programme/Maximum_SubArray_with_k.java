package basic_programme;

public class Maximum_SubArray_with_k {
    public static void main(String[] args) {
        int arr[]={100,200,300,400};
        int k=2;
        System.out.println(xyz(arr,k));

    }
    static int xyz(int arr[],int k){
        int n=arr.length;
        int windowsum=0;
        for(int i=0;i<k;i++){
            windowsum+=arr[i];
        }
        int maxSum=windowsum;
        for(int i=k;i<n;i++){
            windowsum=windowsum+arr[i]-arr[i-k];
            maxSum=Math.max(maxSum,windowsum);
        }
        return maxSum;
    }
}
