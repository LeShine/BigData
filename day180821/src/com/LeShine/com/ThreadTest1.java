package com.LeShine.com;

/**
 * @author LeShine
 * @date: 2018年8月21日 下午3:31:09
 * @version: v1.0.0
 * @explain:
 */
public class ThreadTest1 {
	public static void main(String[] args) {
		Thread th = new ThreadTest();
		th.start();// 以线程方式启动
		// th.run();//
		for (int j = 0; j < 10; j++) {
			System.out.println("main中:" + j);
		}
	}
}
