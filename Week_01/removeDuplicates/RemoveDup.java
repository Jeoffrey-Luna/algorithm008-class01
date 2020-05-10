package cn.test.demo;
import java.util.Arrays;

public class RemoveDup {
    public static void main(String[] args) {
        int [] target = {0,0,1,1,1,2,2,3,3,4};
        int [] target2 = {1,1,2};
        Solution s = new Solution();
        int r = s.removeDuplicates(target);
        System.out.println(Arrays.toString(target));
        System.out.println(r);
    }
}


class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1;j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}