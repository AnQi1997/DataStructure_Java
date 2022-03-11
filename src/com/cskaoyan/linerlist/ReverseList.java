package com.cskaoyan.linerlist;

import sun.security.util.Length;

import java.util.Arrays;

/**
 * @Author: AQ
 * @Date: 2022/3/6 17:26
 * @Description:
 **/
public class ReverseList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        reverseList(arr);
        System.out.println("逆置后：");
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseList(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
}
