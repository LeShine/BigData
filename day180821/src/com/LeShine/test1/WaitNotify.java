package com.LeShine.test1;

/**
 * @author LeShine
 * @date: 2018年8月21日 下午9:04:28
 * @version: v1.0.0
 * @explain:
 */
public class WaitNotify {
	static Object mutex = new Object();

	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		Thread th1 = new Thread(thread1);
		Thread th2 = new Thread(thread2);
		th1.setName("wait");
		th2.setName("notify");
		th1.start();
		try {
			th1.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th2.start();

	}

	static class Thread1 implements Runnable {

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Runnable#run()
		 */
		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized (mutex) {
				try {
					mutex.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "wait中");
			}
		}

	}

	static class Thread2 implements Runnable {

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Runnable#run()
		 */
		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized (mutex) {
				mutex.notify();
				System.out.println(Thread.currentThread().getName() + "调用了notify");
			}
			System.out.println(Thread.currentThread().getName() + "释放了锁");
		}

	}

}
