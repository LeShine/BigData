package com.LeShine.test1;

/**
 * @author LeShine
 * @date: 2018年8月21日 下午8:53:13
 * @version: v1.0.0
 * @explain:
 */
public class DaemoonTest2 implements Runnable {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "-----" + i);
		}
	}

}
