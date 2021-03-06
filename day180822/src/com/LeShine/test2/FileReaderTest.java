package com.LeShine.test2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author LeShine
 * @date: 2018年8月22日 下午7:51:52
 * @version: v1.0.0
 * @explain:字符读入流
 */
public class FileReaderTest {
	public static void main(String[] args) {
		fileReaders();
		fileWriters();
		fileReaders();
	}

	/**
	 * 
	 */
	private static void fileReaders() {
		// TODO Auto-generated method stub
		File file = new File("E:\\bigdata\\exercise\\a.txt");
		FileReader fd = null;
		try {
			fd = new FileReader(file);
			char[] ch = new char[5];
			int len;
			while ((len = fd.read(ch)) != -1) {
				String string = new String(ch, 0, len);
				System.out.println(string);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fd.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * 
	 */
	private static void fileWriters() {
		// TODO Auto-generated method stub
		File file = new File("E:\\bigdata\\exercise\\a.txt");
		String string = "dfdskjk的房价开始到付金额为粉丝555";
		String string2 = "455465456";
		FileWriter fWriter = null;
		try {
			fWriter = new FileWriter(file);
			fWriter.write(string);
			fWriter.append(string2);
			fWriter.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}