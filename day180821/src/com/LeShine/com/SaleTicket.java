package com.LeShine.com;

/**
 * @author LeShine
 * @date: 2018��8��21�� ����4:07:40
 * @version: v1.0.0
 * @explain:
 */
public class SaleTicket {
	public static void main(String[] args) {
		TicketTest tk = new TicketTest(100);
		Thread th = new Thread(tk);
		th.setName("����1");
		Thread th2 = new Thread(tk);
		th2.setName("����2");
		th.start();
		th2.start();

	}
}