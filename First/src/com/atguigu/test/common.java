package com.atguigu.test;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/*
 * 求一个数组的最大值、最小值、平均数、总和
 * 
 */
public class common {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i = 0;i < arr.length;i++) {
			arr[i] = (int)(Math.random()*(99-10+1)+10);
			System.out.print(" " + arr[i]);
		}
		System.out.println();
		int maxarr = arr[0];
		int min = arr[0];
		int sum = 0;
		int average = 0;
		for(int i = 0;i < arr.length;i++) {
			if(maxarr < arr[i]) {
				maxarr = arr[i];
				}
			if(min > arr[i])
				min = arr[i];
			sum+=arr[i];
		}
		average = sum/arr.length;
		System.out.println("最大数是：" + maxarr);
		System.out.println("最小数是：" + min);
		System.out.println("总和是：" + sum);
		System.out.println("平均数数是：" + average);
	}
}
