//package com.shome.demo;
//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//public class Lambda{
//	public static void main(String[] args) {
//		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
//		Collections.sort(names, new Comparator<String>() {
//		    @Override
//		    public int compare(String a, String b) {
//		        return a.compareTo(b);
//		    }
//		});
//		System.out.println("原始方法："+names.toString());
//		
//		
//		Collections.sort(names, (String a, String b) -> {
//		    return b.compareTo(a);
//		});
//		
////		Collections.sort(names, (String a, String b) -> b.compareTo(a));
//		
////		Collections.sort(names, (a, b) -> b.compareTo(a));
//		
//		System.out.println("Lambda:"+names);
//		
//	}
//}
