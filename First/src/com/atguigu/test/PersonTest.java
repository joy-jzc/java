package com.atguigu.test;

public class PersonTest {
}
//设计类就是设计类的成员
class Person{
	//属性 = 成员变量 = field = 域、字段
	 String name;
	 int age = 1;
	 boolean isMale;
	//方法 = 成员方法 = 函数 = method
	  public void eat() {
		  System.out.println("人可以吃饭");
	  }
	  public void sleep(){
		  System.out.println("人可以睡觉");
	  }
	  public void talk(String language){
		  System.out.println("人可以说话，使用的是" + language);
	  }
}	