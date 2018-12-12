package com.LeShine.com;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author LeShine
 * @date: 2018��8��20�� ����8:59:20
 * @version: v1.0.0
 * @explain:treeSetĬ�������ظ�,��Ϊnull
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
		// ts.add(null); //��Ϊnull
		// �����ֺ���ĸ
		Iterator<String> it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// ��ǿforѭ��
		for (String s : ts) {
			System.out.println(s);
		}

		int[] a = { 1, 2, 5, 8, 6 };
		for (int i : a) {
			System.out.println(i);
		}

	}
}