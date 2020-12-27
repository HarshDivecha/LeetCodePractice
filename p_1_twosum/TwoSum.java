package com.example.p_1_twosum;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // one valid answer exists for sure
    // same element cannot be given as an answer

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> table = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            // num : index
            if((table.containsKey(diff))&&(i != table.get(diff)) ){
                return new int[] {i,table.get(diff)};
            }
            table.put(nums[i],i);
        }

        return null;
    }


    public static void main(String[] args) {
        int arr1[] = {2,7,11,15}; int t1=9;


        TwoSum obj = new TwoSum();
        System.out.println(obj.twoSum(arr1,t1)[0]);
    }
}
