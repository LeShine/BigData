package com.LeShine.com;

/**
 * @author LeShine
 * @date: 2018年8月21日 下午4:07:40
 * @version: v1.0.0
 * @explain:
 */
public class SaleTicket {
	public static void main(String[] args) {
		TicketTest tk = new TicketTest(100);
		Thread th = new Thread(tk);
		th.setName("窗口1");
		Thread th2 = new Thread(tk);
		th2.setName("窗口2");
		th.start();
		th2.start();

	}
}
