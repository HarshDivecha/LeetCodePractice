package com.example.p_152_maxProdSubArr;

import com.example.p_53_maxSubarray.MaxSubArr;

public class MaxProdSubarr {
    public int maxProduct1(int[] nums) {
        if (nums.length==0) return 0;
        if (nums.length==1) return nums[0];

        boolean zeroFlag=false;
        int localMax=0;
        int max=Integer.MIN_VALUE;
        int curr=1;

        for(int i:nums){
            curr*=i;
            if(curr>max) max=curr;
            if(i>=max) localMax=i;
            if(curr==0){curr=1;zeroFlag=true;}

            System.out.println(curr+" "+max+" "+localMax);
        }

        return Math.max(localMax,max);
    }

    public int maxProduct(int[] nums) {
        if (nums.length==0) return 0;
        if (nums.length==1) return nums[0];

        int lmax=Integer.MIN_VALUE;
        int rmax=Integer.MIN_VALUE;
        int lcurr=1;
        int rcurr=1;


        for(int i:nums){
            rcurr*=i;
            if(rcurr>rmax) rmax=rcurr;
            if(rcurr==0){rcurr=1;}
            System.out.println(rcurr+" "+rmax);
        }

        System.out.println("");
        for(int i=nums.length-1; i>=0; i--){
            lcurr*=nums[i];
            if(lcurr>rmax) lmax=lcurr;
            if(lcurr==0){lcurr=1;}
            System.out.println(lcurr+" "+lmax);
        }


        return Math.max(lmax,rmax);
    }

    public static void main(String[] args) {
        MaxProdSubarr obj = new MaxProdSubarr();
        int arr1[] = {1,3,0,-2,3,-4};//24
        int arr2[] = {3,-1,4};//4
        int arr3[] = {-2,0,-1};//0
        int arr4[] ={2,-5,-2,-4,3};//24

        System.out.println(obj.maxProduct(arr1));
    }
}
