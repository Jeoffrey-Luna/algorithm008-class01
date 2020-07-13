package cn.test.demo;

import javax.print.attribute.standard.PrinterResolution;

public class Climbstairs {
    public static void main(String[] args) {
        int target = 3;
        Solution s = new Solution();
        int steps = s.climbStairs(target);
        System.out.println(steps);
    }
}

class Solution{
    public int climbStairs(int n){
        return climb_stairs(0,n);
    }
    public int climb_stairs(int i,int n){
        if(i > n){
            return 0;
        }
        if(i == n){
            return 1;
        }
        return climb_stairs(i+1,n) + climb_stairs(1+2,n);
    }
}
