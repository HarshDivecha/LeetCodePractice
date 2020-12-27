package com.example.p_238_productOfArrayExIt;

public class ProdItself {
    public int[] productExceptSelf(int[] nums) {
        int[] r = new int[nums.length];
        int[] l = new int[nums.length];
        int[] op = new int[nums.length];
        l[0]=1;
        r[nums.length-1]=1;
        //right scan
        for(int i=nums.length-2; i>=0;i--){
            r[i]=r[i+1]*nums[i+1];
        }

        //left scan
        for(int i=1;i<nums.length;i++){
            l[i]=l[i-1]*nums[i-1];
        }

        for(int i=0;i<nums.length;i++){
            op[i] = l[i]*r[i];
        }
        return op;
    }
}
