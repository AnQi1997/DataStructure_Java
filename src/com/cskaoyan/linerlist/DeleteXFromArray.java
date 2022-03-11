package com.cskaoyan.linerlist;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: AQ
 * @Date: 2022/3/6 17:35
 * @Description:
 **/
public class DeleteXFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        System.out.println("请输入要删除的元素的值：value = ");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        sc.close();
        deleteXFromArray(arr, value);
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }

    private static void deleteXFromArray(int[] arr, int value) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                count++;//累计值为value的元素的个数，<= i
            } else {
                arr[i - count] = arr[i];
            }
        }
        for (int i = arr.length - count; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
}
