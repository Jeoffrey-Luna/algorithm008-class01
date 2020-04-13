class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0 ; i < nums.length ; i++) {
            for ( int j = i+1 ; j < nums.length ; j ++ ) {
                if ( nums[j] == target - nums[i]) {
                    
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

public class Twosum{
    public static void main(String args[]){
        Solution s = new Solution();
        int num [] = {2,7,11,15};
        int t = 9 ;
        s.twoSum(num,t);
     
    }
}