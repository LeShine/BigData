package com.LeShine.test1;

/**
 * @author LeShine
 * @date: 2018年8月21日 下午8:47:57
 * @version: v1.0.0
 * @explain:
 */
public class DaemonTest implements Runnable {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println(Thread.currentThread().getName() + "我是守护线程");
		}
	}
}
