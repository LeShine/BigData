package com.LeShine.com;

/**
 * @author LeShine
 * @date: 2018��8��21�� ����3:47:40
 * @version: v1.0.0
 * @explain:
 */
public class TicketTest implements Runnable {
	private int total;
	Object mutex = new Object();

	TicketTest(int total) {
		this.total = total;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (total > 0) {
			synchronized (mutex) {
				total--;
				String name = ThreadTest.currentThread().getName();
				System.out.println(name + "������Ʊ��������Ʊ" + total + "��");
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}