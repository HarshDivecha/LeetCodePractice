package com.example.p_11_maxCapacity;

public class MaxCapacity {
    public int maxArea(int[] height) {

        if(height.length<2 || height==null ) return 0;

        int i=0;
        int j=height.length-1;
        int maxcapacity=0;

        while(i!=j){
            int h1= height[i];
            int h2= height[j];
            int spaces = j-i;

            int capacity = spaces*(Math.min(h1,h2));
            if(capacity>maxcapacity) maxcapacity=capacity;


            if (h1 < h2) i++;
            else j--;
        }

        return maxcapacity;
    }

    public static void main(String[] args) {
        MaxCapacity obj = new MaxCapacity();
        int arr1[] = {1,8,6,2,5,4,8,3,7}; //49
        int arr2[] = {4,3,2,1,4}; //16
        int arr3[] = {1,2,1}; //2
        int arr4[] = {1,1};//1
        int arr5[] = {2,3,4,5,18,17,6};//17

        System.out.println(obj.maxArea(arr2));
    }
}
