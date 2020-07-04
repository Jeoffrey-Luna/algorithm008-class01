package cn.test.demo;

import java.util.Arrays;

public class Twosum {
    public static void main(String args[]){
        int target = 9;
        int[] nums = {2, 7, 11, 15};
        Solution s = new Solution();
        int []a = s.sum(nums,target);
        System.out.println(Arrays.toString(a));
    }    
}

class Solution{
    public int[] sum(int[] nums, int target){
        for(int x = 0; x< nums.length; x++){
            for(int y = x + 1 ;y < nums.length; y++){
                if(nums[y]== target - nums[x]){
                    return new int[]{x,y};
                }

            }
           
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}