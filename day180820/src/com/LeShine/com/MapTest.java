package com.LeShine.com;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/**
 * @author LeShine
 * @date: 2018年8月20日 下午9:08:32
 * @version: v1.0.0
 * @explain:不存在索引，无序，只能通过键值访问，快速，不属于collection 键值对存储 HashMap HashTable
 *                                             实现了map接口，键值可为null
 */
public class MapTest {
	public static void main(String[] args) {
		// 允许null键值
		HashMap<String, Person> hp = new HashMap<String, Person>();
		hp.put("12", new Person("LeShine", 18));
		hp.put("12", new Person("LeShine", 38));
		hp.put("13", new Person("LeShine2", 28));
		hp.put(null, null);
		// Person person = hp.get("12");
		// System.out.println(person);

		Set<String> keySet = hp.keySet();
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			System.out.println(hp.get(iterator.next()));
		}

		// HashTable
		// 任何非null值可作为键值
		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		hashtable.put("1", "wo");
		hashtable.put("2", "wo252");
		// 键值不能为null
		// hashtable.put(null, "wo");
		// hashtable.put("3", null);

		Set<String> keySet2 = hashtable.keySet();
		Iterator<String> iterator2 = keySet2.iterator();
		while (iterator2.hasNext()) {
			System.out.println(hashtable.get(iterator2.next()));
		}
		for (String s : keySet2) {
			System.out.println(hashtable.get(s));
		}

		Enumeration<String> keys = hashtable.keys();
		while (keys.hasMoreElements()) {
			System.out.println(": " + hashtable.get(keys.nextElement()));
		}

		Iterator iterator3 = hashtable.entrySet().iterator();
		while (iterator3.hasNext()) {
			Object next = iterator3.next();
			System.out.println(next);

		}

		System.out.println(hashtable.containsKey("1"));
		System.out.println(hashtable.containsKey(1));
		System.out.println(hashtable.containsValue("wo"));

		System.out.println("foreach---------------");
		hashtable.forEach((k, v) -> {
			System.out.println(k + ":" + v);
		});
	}
}
