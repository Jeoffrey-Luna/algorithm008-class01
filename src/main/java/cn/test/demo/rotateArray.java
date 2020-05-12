package cn.test.demo;

import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int [] target = {1,2,3,4,5,6,7} ;
        int steps = 3;
        Solution s = new Solution();
        s.rotate(target,steps);
        System.out.println(Arrays.toString(target));
    }
}


class Solution {
    public void rotate(int[] nums, int k) {
        if (k <= 0) {
            return;
        }
        for (int i = 0; i < k; i++) {
            int previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                int temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }

        }

    }
}