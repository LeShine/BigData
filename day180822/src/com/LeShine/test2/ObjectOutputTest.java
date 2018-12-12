package com.LeShine.test2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author LeShine
 * @date: 2018��8��22�� ����8:58:42
 * @version: v1.0.0
 * @explain:���л��뷴���л�
 */
public class ObjectOutputTest {
	public static void main(String[] args) {
		serialableT();
		unserialable();
	}

	/**
	 * 
	 */
	private static void serialableT() {
		// TODO Auto-generated method stub
		Student student = new Student("LeShine", 18);
		// �½�һ���������
		File fiS = new File("E:\\bigdata\\exercise\\student");
		ObjectOutputStream oos = null;
		try {
			// ͨ������fileOutputStream���󣬽�������Ϊһ���ļ�
			oos = new ObjectOutputStream(new FileOutputStream(fiS));
			// ������д��
			oos.writeObject(student);
			oos.flush();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (oos != null) {
					oos.close();
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * 
	 */
	private static void unserialable() {
		// TODO Auto-generated method stub
		File fiS = new File("E:\\bigdata\\exercise\\student");
		ObjectInputStream objs = null;
		try {
			objs = new ObjectInputStream(new FileInputStream(fiS));
			Student stu = (Student) objs.readObject();
			System.out.println(stu.getName());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (objs != null) {
				try {
					objs.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}