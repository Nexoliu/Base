package com.heima.Base.Day05;
/*
 * A:案例演示
 * a:ArrayIndexOutOfBoundsException:数组索引越界异常
 * 原因：你访问了不存在的索引。
 * b:NullPointerException:空指针异常
 * 原因：数组已经不在指向堆内存了。而你还用数组名去访问元素。
 * int[] arr = {1,2,3};
 * arr = null;
 * System.out.println(arr[0]);
 */
public class Demo7_Exception {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr = null;
        System.out.println(arr[0]);
    }
}
