package com.atguigu.test;
/*
 * 数组的复制、反转、
 * 
 */

public class ArrayTest {
	public static void main(String[] args) {
		String[] arr = new String[] {"AA","BB","CC","DD","EE","FF"};
		//数组的赋值
		String[] arr1 = new String[arr.length];
		for(int i = 0;i < arr.length;i++) {
			arr1[i] = arr[i];
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		//数组的反转
		for(int i = 0;i < arr.length/2;i++) {
			String Tem = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length -i - 1] = Tem;
		}
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}