package com.atguigu.firstjava;

import java.util.Scanner;

public class First {
	public static void main(String[] args) {
		//1.使用Scanner,读取学生个数
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生人数：");
		int number = scanner.nextInt();
		//2.创建数组
		int[] scores = new int [number];
		//3，给数组赋值
		System.out.println("请输入" + number + "个学生成绩:");
		int maxScore = 0;
		for(int i = 0;i < scores.length;i++) {
			scores[i] = scanner.nextInt();
			//求出数组最大值
			if(maxScore < scores[i]) {
				maxScore = scores[i];	
			}
		}
		//4.求出数组元素最大值
//		int maxScore = 0;
//		for (int i = 0;i < scores.length;i++) {
//			if(maxScore < scores[i]) {
//				maxScore = scores[i];	
//			}
//		}
		//5.判断等级并输出等级和成绩
		char level;
		int a = 0;
		for(int i = 0;i < scores.length;i++) {
			if(maxScore - scores[i] <= 10) {
				level = 'A';
			}else if(maxScore - scores[i] <= 20) {
				level = 'B';
			}else if(maxScore - scores[i] <= 30) {
				level = 'C';
			}else{
				level = 'D';
			}
			a = i + 1;
			System.out.println("student " + a + ",score is " + level);
		}
	}
}
