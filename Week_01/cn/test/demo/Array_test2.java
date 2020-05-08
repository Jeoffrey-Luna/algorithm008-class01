package cn.test.demo;

public class Array_test2 {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,3,1,3};
        ChangeIt.doIt(nums1);
        for (int i = 0;i<nums1.length;i++) {
            System.out.println(nums1[i]);

        }
    }

}

class ChangeIt {
    static void doIt(int [] z){
        z = null ;
    }
}