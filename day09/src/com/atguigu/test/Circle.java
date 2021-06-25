package com.atguigu.test;
/**
 * 
 * @Description
 * @author bic Email:1282037791@qq.com
 * @version
 * @date 2021年6月24日上午11:59:38
 */
//（1）定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个findArea()方法返回圆的面积。
public class Circle {
		//radius圆的半径。
		double radius;
	public double findArea() {
		return Math.PI * radius * radius;
	}
}
