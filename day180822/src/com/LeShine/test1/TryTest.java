package com.LeShine.test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author LeShine
 * @date: 2018��8��22�� ����5:17:06
 * @version: v1.0.0
 * @explain:
 */
public class TryTest {
	public static void main(String[] args) {
		try {
			System.out.println("89989");
			FileInputStream fileInputStream = new FileInputStream("a.txt");
			System.out.println("dfdf");
			return;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
			System.out.println("54665");
		} finally {
			System.out.println("dfdsfdswe");
		}

	}
}
