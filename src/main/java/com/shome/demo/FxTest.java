package com.shome.demo;

import java.util.HashMap;
import java.util.Map;

public class FxTest {

	
	/**
	 * 除了集合类之外，Java 类库中还有几个其他的类也充当值的容器。这些类包括 WeakReference、SoftReference 和 ThreadLocal。
	 * 它们都已经在其包含的值的类型上泛型化了，所以 WeakReference<T> 
	 * 是对 T 类型的对象的弱引用，ThreadLocal<T> 则是到 T 类型的线程局部变量的句柄。
	 * @param args
	 */
	public static void main(String[] args) {
		Map map = new HashMap<>();
		map.put(1, 1);
		map.put("k", "abc");
		String str = (String) map.get("k");
		String str2 =  (String) map.get(1);
		System.out.println(str+":"+str2);
	}

}
