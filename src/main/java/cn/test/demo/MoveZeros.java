package cn.test.demo;

public class MoveZeros{
    public static void main(String[] args) {
        int [] target = {0,1,0,3,12};
        moveZeros(target);
        for (int j =0 ;j<target.length; j++) {
            System.out.println(target[j]);
        }
    }
    public static void moveZeros(int [] nums){
        int zeroPos = 0 ;
        for (int i = 0;i<nums.length;i++) {
            if (nums[zeroPos] == 0) {
                if ( nums[i] != 0) {
                    nums[zeroPos] = nums[i];
                    nums[i] = 0 ;
                    zeroPos++;
                }
            }else{
                zeroPos++;
            }
        }
    }
}