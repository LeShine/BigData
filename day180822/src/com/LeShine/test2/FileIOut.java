package com.LeShine.test2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author LeShine
 * @date: 2018��8��22�� ����7:32:55
 * @version: v1.0.0
 * @explain:�ֽ������
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
		String string = "fdfds�ط��ľ��ǻ��ʦ�Ŀ��������緶Χ45445";
		File file = new File("E:\\bigdata\\exercise\\a.txt");
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write(string.getBytes());
			fileOutputStream.flush();// ǿ������������ݣ���֤��������
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