package com.atguigu.test;
/*
 * 数组的复制、反转、查找（二分法查找）
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
		System.out.println();
		//查找
		//线性查找
		String dest = "LL";
		boolean isFlag = true;
		for(int i = 0;i < arr.length;i++) {
			if(dest.equals(arr[i])) { 
				System.out.println("找到指定元素，位置为：" + i);
				isFlag = false;
				break;
			}
		}
		if(isFlag)
		System.out.println("很遗憾，没有找到！");
		//二分法查找
		//前提：所要查找的数组必须有序
		int[] arr2 = new int[]{10,20,30,40,50,60,80,90,100};
	    int dest1 = 10;
	    int start = 0;//初始索引
	    int end = arr2.length - 1;//结束索引
	    boolean isFlag1 = true;
	    while(start <= end) {
	    	int tem = (start + end)/2;
	    	if(dest1 == arr2[tem]) {
	    		System.out.println("找到了指定元素，位置为：" + tem);
	    		isFlag1 = false;
	    		break;
	    	}else if(dest1 > arr2[tem]){
	    		start = tem + 1;
	    	} else if (dest1 < arr2[tem]) {
	    		end = tem - 1;
	    	}	
	    }
	    if(isFlag1) {
	    	System.out.println("很遗憾，没有找到!");
	    }
	}
}
