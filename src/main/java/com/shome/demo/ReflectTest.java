package com.shome.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;



public class ReflectTest {
	public static void main(String[] args) throws ClassNotFoundException {
//		Scanner sc = new Scanner(System.in);   
//	    System.out.println("ScannerTest, Please Enter Name:");   
//	    String name = sc.nextLine();  //读取字符串型输入   
//	    System.out.println("ScannerTest, Please Enter Age:");   
//	    int age = sc.nextInt();    //读取整型输入   
//	    System.out.println("ScannerTest, Please Enter Salary:");   
//	    float salary = sc.nextFloat(); //读取float型输入   
//	    System.out.println("Your Information is as below:");   
//	    System.out.println("Name:" + name +"\n" + "Age:"+age + "\n"+"Salary:"+salary); 
		Scanner sc;
		String name;
		while (true) {
			sc = new Scanner(System.in);  
			System.out.println("ScannerTest, Please Enter Class complete Name:");
			name = sc.nextLine();
			if(null != name && !name.isEmpty()){
				
				break;
			}else{
				
			}
		}
		
		
//		String name = "java.lang.String";
		
		Class<?> c = Class.forName(name);  
//        Object c = stu.newInstance(); 
		
		Method[] methods = c.getMethods();
		for (int i = 0; i < methods.length; i++) {
			System.out.println(name+"方法："+i+":"+methods[i]);
		}
		
		Field[] fields = c.getFields();
		for (int i = 0; i < fields.length; i++) {
			System.out.println(name+"属性："+i+":"+fields[i]);
		}
		
		Constructor[] cons = c.getConstructors();
		for (int i = 0; i < cons.length; i++) {
			System.out.println(name+"构造器："+i+":"+cons[i]);
		}
		
	}
}
