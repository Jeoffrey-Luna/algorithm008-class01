package cn.test.demo;

public class Container {
    public static void main(String[] args) {
        int [] target = {1,8,6,2,5,4,8,3,7};
        int r = maxArea(target);
        System.out.print(r);
    }

    public static int maxArea (int [] nums ) {
        int max = 0;
        for (int i = 0 ; i < nums.length -1 ; ++i) {
            for (int j = i+1 ; j < nums.length; ++j) {
                int area = (j-i)*Math.max(nums[i],nums[j]);
                max = Math.max(max,area);
            }
        }
        return max;
    }
}
