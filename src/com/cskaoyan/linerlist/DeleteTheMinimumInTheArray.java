package com.cskaoyan.linerlist;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: AQ
 * @Date: 2022/3/6 16:58
 * @Description:
 **/
public class DeleteTheMinimumInTheArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 10};
        System.out.println("删除前：");
        //删除函数
        System.out.println(Arrays.toString(arr));
        delMinInArr(arr);
        System.out.println(Arrays.toString(arr));

        arr = Arrays.copyOf(arr, arr.length-1);
        System.out.println("删除后：");
        System.out.println(Arrays.toString(arr));
    }

    private static void delMinInArr(int[] arr) {
        int min = arr[0], minPos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minPos = i;
            }
        }
        //找到最小值后：数组末尾元素与之交换,末尾元素
        arr[minPos] = arr[arr.length - 1];
    }
}
