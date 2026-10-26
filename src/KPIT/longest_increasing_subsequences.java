package KPIT;

import java.util.Arrays;

public class longest_increasing_subsequences {
//    Input: nums = [10,9,2,5,3,7,101,18]
//Output: 4
//Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
    public static void main(String[] args) {

        int nums[] ={10,9,2,5,3,7,101,18};
        System.out.println(fis(nums));



    }
    public static int fis(int []nums){
        int n=nums.length;
        int dp[]=new int[n];
        int answar=1;
        Arrays.fill(dp,1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            answar=Math.max(answar,dp[i]);
        }
        return answar;

    }
}
