package com.LeShine.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author LeShine
 * @date: 2018��8��23�� ����3:22:05
 * @version: v1.0.0
 * @explain:�ļ��������ļ�
 */
public class CopyFileTest {
	public static void main(String[] args) throws FileNotFoundException {
		// �½������ļ�����
		System.out.println("������Ҫ�������ļ�");
		Scanner scanner = new Scanner(System.in);
		String sourceFile = scanner.nextLine();
		System.out.println("������Ŀ���ļ�����·��");
		String targetFile = scanner.nextLine();
		File sFile = new File(sourceFile);
		File tFile = new File(targetFile);
		// �����ļ���
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(sFile)));
		StringBuffer stringBuffer = new StringBuffer();
		BufferedWriter bufferedWriter = null;
		try {
			while (true) {
				String readLine = bufferedReader.readLine();
				if (readLine != null) {
					stringBuffer.append(readLine + "\r\n");
				} else {
					break;
				}
			}
			bufferedWriter = new BufferedWriter(new FileWriter(tFile));
			bufferedWriter.write(stringBuffer.toString());
			bufferedWriter.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (bufferedWriter != null) {
				try {
					bufferedWriter.close();
					bufferedReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

	}
}