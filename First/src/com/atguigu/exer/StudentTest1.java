package com.atguigu.exer;
/*
 * 
 * 此代码是对StudentTest.java的优化
 * 
 * 
 * 
 * 对象数组：
 * 定义对象Student，包含三个属性：学号number（int），年级state（int），成绩score（int）
 * 创建20个学生对象，学号1到20，年级和成绩由随机数确定。
 * 问题一：打印3年级（state值为3）的学生信息
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 * 
 * 
 * 提示
 * 1.生成随机数：Math.radndom（），返回值类型double；
 * 2.四舍五入取整：Math.round(double d),返回值类型long。 
 */

public class StudentTest1 {
	public static void main(String[] args) {
		Student1[] stus = new Student1[20];
		for(int i = 0;i < stus.length;i++) {
			stus[i] = new Student1();
			stus[i].number = i + 1;
			stus[i].state = (int)(Math.random() * (6 - 1 + 1) + 1);
			stus[i].score = (int)(Math.random() *(100 - 0 + 1) - 0);
		}
		
		StudentTest1 test = new StudentTest1();
		
//问题一，打印年级为三的学生信息
		test.searchState(stus, 3);
		System.out.println("******************");	
//问题二：冒泡排序打印学生成绩
		test.sort(stus);
		//遍历数组
		test.print(stus);
	}
/**
* @Description 遍历Student1[]数组的操作
* @param stus
*/
	public void print(Student1[] stus) {
		for(int i = 0;i < stus.length;i++) {
			System.out.println(stus[i].info());
		}
	}	
/**
* 
* @Description 查找Student1数组中指定年级的学生信息
* @param stus  要查找的数组
* @param state 要查找的年级
*/
	public void searchState(Student1[] stus,int state) {
		for(int i = 0;i < stus.length;i++) {
			if(stus[i].state == state) {
				System.out.println(stus[i].info());
			}
		}
	}
/**
* @Description 给student1数组排序
* @param stus
*/
	public void sort(Student1[] stus){
		for(int i = 0;i < stus.length;i++) {
			for(int j = 0;j < stus.length - 1;j++) {
				if(stus[j].score >= stus[j + 1].score) {
					Student1 Tem = stus[j];
					stus[j] = stus[j + 1];
					stus[j + 1] = Tem;
				}
			}
		}
	}

}



//Student 对象
class Student1{
	int number;//学号
	int state;//年级
	int score;//成绩
	
	public String info() {
		return "学号：" + number +",年级:" + state +",成绩:" + score;
	}
}