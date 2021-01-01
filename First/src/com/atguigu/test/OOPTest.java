package com.atguigu.test;
/*
 * 面向对象的三条主线
 * 1.java类及类的成员：属性、方法、构造器：代码块、内部类
 * 2.面向对象的三大特征：封装性、继承性、多态性（抽象性）
 * 3.其他关键字：this、super等。。。。。
 */
//测试类
public class OOPTest {
	 public static void main(String[] args) {
	//创建Person类的对象 = 类的实例化 = 实例化类
	Person p1 = new Person();
	//调用对象的结构，属性，方法
	//调用属性："对象.属性"
	p1.name = "Tom";
	System.out.println(p1.name);
	
	//调用对象
	p1.talk("Chinese");
	
	//******
	Person p2 = new Person();
	System.out.println(p2.name);

	 }
}