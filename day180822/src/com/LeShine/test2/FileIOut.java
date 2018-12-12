package com.LeShine.test2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author LeShine
 * @date: 2018年8月22日 下午7:32:55
 * @version: v1.0.0
 * @explain:字节输出流
 */
public class FileIOut {
	public static void main(String[] args) {
		outByte();
	}

	/**
	 * 
	 */
	private static void outByte() {
		// TODO Auto-generated method stub
		String string = "fdfds地方的就是会计师的开发的世界范围45445";
		File file = new File("E:\\bigdata\\exercise\\a.txt");
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write(string.getBytes());
			fileOutputStream.flush();// 强制输出最后的数据，保证数据完整
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
