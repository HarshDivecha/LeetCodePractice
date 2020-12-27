package com.example.p_217_duplicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Duplicates {
    public boolean containsDuplicate(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i:nums){
            if(arr.contains(i)){
                return true;
            }
            arr.add(i);
        }
        return false;
    }

    public boolean containsDuplicate1(int[] nums) {
        Set set = new HashSet();
        for(int i: nums){
            if(!set.add(i)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Duplicates obj = new Duplicates();
        obj.containsDuplicate(new int[] {1,2,3,1});
    }

}
