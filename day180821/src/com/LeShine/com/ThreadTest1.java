package com.LeShine.com;

/**
 * @author LeShine
 * @date: 2018��8��21�� ����3:31:09
 * @version: v1.0.0
 * @explain:
 */
public class ThreadTest1 {
	public static void main(String[] args) {
		Thread th = new ThreadTest();
		th.start();// ���̷߳�ʽ����
		// th.run();//
		for (int j = 0; j < 10; j++) {
			System.out.println("main��:" + j);
		}
	}
}