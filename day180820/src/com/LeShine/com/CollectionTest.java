package com.LeShine.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author LeShine
 * @date: 2018年8月20日 下午7:24:35
 * @version: v1.0.0
 * @explain:
 */
public class CollectionTest {
	public static void main(String[] args) {
		function();
	}

	public static void function() {
		Collection<String> cll = new ArrayList<String>();
		cll.add("你好");
		cll.add("您好");
		cll.add("erhao");
		System.out.println(cll);
		Iterator<String> it = cll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		cll.clear();
		System.out.println(cll);
		cll.add("你好");
		cll.add("您好");
		cll.add("erhao");
		System.out.println(cll);

		// contains()
		boolean b = cll.contains("你好");
		System.out.println(cll.contains("nihao"));
		System.out.println(cll.contains("erhao"));

		// toArrary
		Object[] ar = cll.toArray();
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

		// remove
		boolean bbb = cll.remove("erhao");
		System.out.println(bbb);
		System.out.println(cll);
		System.out.println("-------------");
		Collection clle = new ArrayList();
		clle.add("|dfdfd");
		clle.add(47475);
		clle.add(new Person());

		Iterator it2 = clle.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());

		}

	}
}
