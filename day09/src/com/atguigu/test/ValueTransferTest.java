package com.atguigu.test;
/**
 * 
 * @Description 内存解析理解
 * @author bic Email:1282037791@qq.com
 * @version
 * @date 2021年6月24日上午10:48:30
 */
public class ValueTransferTest {
	public static void main(String[] args) {
		ValueTransferTest test = new ValueTransferTest();
		test.first();
	}
/**
 * 
 * Description
 * @author bic
 * @date 2021年6月24日上午10:49:27
 */
	public void first() {
		int i = 5;
		Value v = new Value();
		v.i = 25;
		second(v,i);
		System.out.println(v.i);
	}
	public void second(Value v,int i) {
		i = 0;
		v.i = 20;
		Value val = new Value();
		v = val;
		System.out.println(v.i + "" + i);
	}
	
}
class Value{
	int i = 15;
}