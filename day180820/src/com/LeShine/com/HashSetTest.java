package com.LeShine.com;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author LeShine
 * @date: 2018年8月20日 下午8:50:31
 * @version: v1.0.0
 * @explain:hashset 无序不重复
 */
public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("dfdf00");
		hashSet.add("dfdf00");
		hashSet.add("dfdw2wf00");
		hashSet.add("dfdf555500");
		hashSet.add("dfdweeree f00");
		Iterator<String> it = hashSet.iterator();
		while (it.hasNext()) {
			String next = it.next();
			System.out.println(next + "de hash值：" + next.hashCode());
		}

	}
}
