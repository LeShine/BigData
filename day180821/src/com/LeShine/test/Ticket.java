package com.LeShine.test;

/**
 * @author LeShine
 * @date: 2018��8��21�� ����6:12:51
 * @version: v1.0.0
 * @explain:
 */
public class Ticket implements Runnable {
	private int total;
	Object mutex = new Object();;

	Ticket(int ticket) {
		this.total = ticket;
	}

	public synchronized void saleTicket() {
		total--;
		String name = Thread.currentThread().getName();
		System.out.println(name + "�۳�һ��Ʊ����ʣ" + total + "��");
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
			saleTicket();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// while (total > 0) {
		//
		// synchronized (mutex) {
		// total--;
		// String name = Thread.currentThread().getName();
		// System.out.println(name + "�۳�һ��Ʊ����ʣ" + total + "��");
		// }
		// try {
		// Thread.sleep(100);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }
	}
}