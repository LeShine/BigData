package com.LeShine.test2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author LeShine
 * @date: 2018��8��22�� ����5:29:39
 * @version: v1.0.0
 * @explain:
 */
public class FileIO {
	public static void main(String[] args) {
		// �����ļ�·�������ļ�����
		File file = new File("c:\\a.txt");
		System.out.println(file);
		System.out.println(file.isDirectory());// �ж϶����Ƿ�ΪĿ¼
		System.out.println(file.exists());// �Ƿ����
		File file2 = new File("E:\\bigdata\\exercise");
		System.out.println(file2.isDirectory());// true

		File[] files = file2.listFiles();
		for (File f : files) {
			if (f.isDirectory()) {
				System.out.println("�ļ���");
			} else if (f.isFile()) {
				System.out.println(f);
			}

		}

		fileInput();
		fileInputB();

	}

	/**
	 * fileinputstream �ļ��ֽ������� ���κ����͵��ļ����ֽڵ���ʽ�����ڴ�
	 */
	private static void fileInput() {
		// TODO Auto-generated method stub
		// ����file���� ����·��Ĭ�ϵ�ǰĿ¼
		File file = new File("E:\\bigdata\\exercise\\a.txt");
		FileInputStream fStream = null;
		try {
			// ����file���󴴽��ļ���
			fStream = new FileInputStream(file);
			// ����file����С�����ֽ����飬�����洢�ļ��ֽ�
			byte[] bytes = new byte[fStream.available()];
			// ���ļ��������ֽ��ļ����ֽ�����
			fStream.read(bytes);
			// ���ֽ�����ת�����ַ������
			System.out.println(new String(bytes));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fStream != null) {
				try {
					fStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * ͨ��ÿ�ζ�ȡһ���ֽڣ�һֱ���ļ���β
	 */
	private static void fileInputB() {
		// TODO Auto-generated method stub
		File file = new File("E:\\bigdata\\exercise\\a.txt");
		FileInputStream fileIn = null;
		try {
			fileIn = new FileInputStream(file);
			int read = fileIn.read();
			while (read != -1) {
				System.out.print((char) read);
				read = fileIn.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fileIn.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}