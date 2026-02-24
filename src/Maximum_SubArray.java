public class Maximum_SubArray {
    public static void main(String[] args) {
         int arr[]={-2,1,-3,4,-1,2,1,-5,4};
//        int arr[]={5,4,-1,7,8};
        System.out.println(maxSubArray(arr));
    }
    static  int maxSubArray(int[] arr){
        int max=0,sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            max=Math.max(sum,max);
            if(sum<=0){
                sum=0;
            }
        }
        return max;
    }
}
