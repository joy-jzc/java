package com.atguigu.test;
/*
 * 数组的冒泡排序实现
 * 
 */
public class BubbleSortTest {
	public static void main(String[] args) {
		int arr[] = new int[] {12,24,46,34,38,52};
		for(int i = 0;i < arr.length - 1;i++) {
		   for(int j = 0;j < arr.length - 1 - i;j++) {
			   if(arr[j] > arr[j + 1]) {
				   int Tem = arr[j];
				   arr[j] = arr[j + 1];
				   arr[j + 1] = Tem;
			   }
		   }	
		}
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
