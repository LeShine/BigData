package com.LeShine.test1;

/**
 * @author LeShine
 * @date: 2018��8��21�� ����8:48:11
 * @version: v1.0.0
 * @explain:
 */
public class Daemon {
	public static void main(String[] args) {
		DaemonTest daemonTest = new DaemonTest();
		DaemoonTest2 daemoonTest2 = new DaemoonTest2();
		Thread thread = new Thread(daemonTest);
		Thread thread2 = new Thread(daemoonTest2);
		thread2.setName("�û��߳�");
		thread.setName("�ػ��߳�");
		thread.setDaemon(true);

		thread2.start();
		thread.start();
	}
}