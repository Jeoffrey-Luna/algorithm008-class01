package moveZeroes;

public class MoveZero {
    public static void main(String[] args) {
        int [] target = {0,1,0,3,12};
        Solution s = new Solution();
        s.moveZero(target);
        for (int j = 0 ;j < target.length; j++) {
            System.out.println(target[j]);
        }
}

class Solution {
        public void moveZero (int[] nums) {
            int pos = 0 ;
            for  (int i = 0;i<nums.length;i++) {
                if (nums[i] != 0) {
                    nums[pos] = nums[i];
                }
            }
        }
    }
}
