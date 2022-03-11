package com.cskaoyan.linerlist;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: AQ
 * @Date: 2022/3/11 18:26
 * @Description:
 **/
public class DeleteValueOfRange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int s, t;
        System.out.println("请输入要删除的数据范围（要求：s < t）：");
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("s = ");
            s = sc.nextInt();
            System.out.print("t = ");
            t = sc.nextInt();
        } while (s > t);
        System.out.println(Arrays.toString(arr));
        System.out.println("删除后：");
        deleteValueOfRange(arr, s, t);
    }

    private static void deleteValueOfRange(int[] arr, int s, int t) {
        int i = 0, k = 0;
        //找到第一个大于s的元素
        for (i = 0; i < arr.length && arr[i] < s; i++) ;
        if (i > arr.length) {
        }
        //找到第一个大于t的元素
        for (k = i; k < arr.length && arr[k] <= t; k++) ;

        //前移
        for (; i < arr.length && k < arr.length; i++, k++) {
            arr[i] = arr[k];
        }
        System.out.println(Arrays.toString(arr));
    }
}
