package com.atguigu.firstjava;
/*
 * 杨辉三角
 * 1.第一有1个元素，第n行有n个元素
 * 2.第一行的第一个元素和最后一个元素都是1
 * 3，从第三行开始，对于非第一个元素和最后一个元素，即，
 * yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
 */
public class yanghui {
	public static void main(String[] args) {
		//1.声明并初始化数组
		int[][] yangHui = new int [10][];
		//2.给数组元素赋值
		for(int i = 0;i < yangHui.length;i++){
			yangHui[i] = new int [i + 1];
			
			//首末赋值
			yangHui[i][0] = yangHui[i][i] = 1;
			//非首末赋值
			for(int j = 1;j < yangHui[i].length - 1;j++) {
				yangHui[i][j] = yangHui[i-1][j-1] + yangHui[i-1][j];
			}
		}
		//3.遍历
		for(int i = 0;i < yangHui.length;i++) {
			for(int j = 0;j < yangHui[i].length;j++) {
			System.out.print(yangHui[i][j] + " ");	
			}
			System.out.println();
		}
	}
}
