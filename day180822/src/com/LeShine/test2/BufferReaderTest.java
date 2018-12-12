package com.LeShine.test2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author LeShine
 * @date: 2018年8月22日 下午8:22:23
 * @version: v1.0.0
 * @explain:
 */
public class BufferReaderTest {
	public static void main(String[] args) {
		bufReaders();
	}

	/**
	 * 
	 */
	private static void bufReaders() {
		// TODO Auto-generated method stub
		File file = new File("E:\\bigdata\\exercise\\a.txt");
		BufferedReader bfr = null;
		try {
			// bfr = new BufferedReader(new FileReader(file));
			// 字节流转字符流转高级字符缓冲流
			bfr = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			String readLine = bfr.readLine();
			while (readLine != null) {
				System.out.println(readLine);
				readLine = bfr.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bfr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private static void bufWriders() {
		// TODO Auto-generated method stub

	}

}
