package com.LeShine.test;

/**
 * @author LeShine
 * @date: 2018��8��21�� ����7:31:25
 * @version: v1.0.0
 * @explain:
 */
public class SaleTicket {
	public static void main(String[] args) {
		Ticket ticket = new Ticket(100);
		Thread thread = new Thread(ticket);
		Thread thread2 = new Thread(ticket);
		thread.setName("����1");
		thread2.setName("����2");
		// thread2.start();
		// thread.start();

		// �߳����ȼ�
		int priority = thread.getPriority();
		System.out.println(priority);// 5
		System.out.println(thread.MAX_PRIORITY);// 10
		System.out.println(thread.MIN_PRIORITY);// 1
		thread.setPriority(9);
		System.out.println(thread.getPriority());// 9

	}
}