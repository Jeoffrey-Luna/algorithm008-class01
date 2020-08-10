package com.test.demo;

import java.util.Arrays;

class Solution{
    public int [] moveZero(int [] nums){
        int i = 0 ;
        int temp = 0 ;
        for (int j = i+1;j<nums.length;j++) {
            if (nums[j] != 0) {
                nums[i] = temp;
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return nums;
    }
}

public class Movezero{
    public static void main(String[] args) {
        int [] source = {0,1,0,3,12};
        Solution s = new Solution();
        s.moveZero(source);
        System.out.println(Arrays.toString(source));

    }
}