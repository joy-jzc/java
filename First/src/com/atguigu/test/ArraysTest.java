package com.atguigu.test;

import java.util.Arrays;

/*
 * java.util.Arrays:操作数组的工具类，里面定义很多操作数组的方法。
 */
public class ArraysTest {
	public static void main(String[] args) {
		//1.boolean equals(int[],intb)     判断两个数组是否相等
		int[] arr1 = new int[] {1,2,3,4};
		int[] arr2 = new int[] {1,3,2,4};
		boolean isEquals = Arrays.equals(arr1,arr2);
		System.out.println(isEquals);
		//2.String to String(int[]a)       输出数组信息
		
		
		//3.void fill(int[],int val)       将指定值填充到数组中
		
		
		//4.void sort(int[]a)              对数组进行排序
		
		
		//5.int binarySearch(int[]a,int key)对排序后的数组进行二分法检索指定的值
		
		
	}
}
