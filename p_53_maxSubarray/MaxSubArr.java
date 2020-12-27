package com.example.p_53_maxSubarray;

import java.util.Map;

public class MaxSubArr {
    public int maxSubArray(int[] nums) {
        if(nums.length==0){return 0;}
        else if(nums.length==1){return nums[0];}

        int max=Integer.MIN_VALUE;
        int curr=0;
        for (int i: nums){
           curr+=i;
           if(i>curr) curr=i;
           if(curr>max) max=curr;
        }
        return max;
    }

    public static void main(String[] args) {
        MaxSubArr obj = new MaxSubArr();
        obj.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4});
    }

}



//    public int maxSubArray(int[] nums) {
//        if(nums.length==0){return 0;}
//        else if(nums.length==1){return nums[0];}
//
//        int max=Integer.MIN_VALUE;
//        int curr=0;
//        for (int i: nums){
//            if(i>max){
//                max=i;
//                curr=i;
//            }
//            else{
//                curr+=i;
//                if(curr>max){max=curr;}
//            }
//            System.out.println(max+" "+curr);
//        }
//        return max;
//    }