package cn.test.demo;

public class Climbstairs {
    public static void main(String[] args) {
        int target = 10;
        Solution s = new Solution();
        int steps = s.climbStairs(10);
        System.out.println(steps);
    }

}


class Solution {
    public int climbStairs(int n) {
    int a =1 , b =1 ;
    while (n-- >0)
        a = (b += a) -a ;
    return  a;
    }
}
