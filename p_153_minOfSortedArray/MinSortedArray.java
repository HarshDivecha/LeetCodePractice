package com.example.p_153_minOfSortedArray;

import java.util.Arrays;

public class MinSortedArray {
    public int findMin(int[] nums) {
        if(nums==null) return 0;
        if(nums.length==1) return nums[0];

        int left=findMin(Arrays.copyOfRange(nums,0,nums.length/2));
        int right=findMin(Arrays.copyOfRange(nums,nums.length/2,nums.length));

        return Math.min(left,right);
    }

    public static void main(String[] args) {
        MinSortedArray obj = new MinSortedArray();
        int[] arr1 = {0,1,2,4,5,6,7};
        int[] arr2 = {3,4,5,1,2};
        int[] arr3 = {4,5,6,7,0,1,2};
        System.out.println(obj.findMin(arr3));
    }
}
