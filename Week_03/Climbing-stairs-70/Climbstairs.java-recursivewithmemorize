package cn.test.demo;

import javax.print.attribute.standard.PrinterResolution;

public class Climbstairs {
    public static void main(String[] args) {
        int target = 5;
        Solution s = new Solution();
        int steps = s.climbStairs(target);
        System.out.println(steps);
    }
}

class Solution{
    public int climbStairs(int n){
        int mem[] = new int[n+1];
        return climb_stairs(0,n,mem);
    }
    public int climb_stairs(int i,int n,int mem[]){
        if(i > n){
            return 0;
        }
        if(i == n){
            return 1;
        }
        if(mem[i]>0){
           return mem[i] ;
        }
        mem[i] =  climb_stairs(i+1,n,mem) + climb_stairs(1+2,n,mem);
        return mem[i];
    }
}
