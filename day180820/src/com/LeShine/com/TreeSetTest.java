package com.LeShine.com;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author LeShine
 * @date: 2018年8月20日 下午8:59:20
 * @version: v1.0.0
 * @explain:treeSet默认升序不重复,不为null
 */
public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("b");
		ts.add("a");
		ts.add("b");
		ts.add("c");
		ts.add("100");
		ts.add("d");
		// ts.add(null); //不为null
		// 先数字后字母
		Iterator<String> it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// 增强for循环
		for (String s : ts) {
			System.out.println(s);
		}

		int[] a = { 1, 2, 5, 8, 6 };
		for (int i : a) {
			System.out.println(i);
		}

	}
}
