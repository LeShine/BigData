package com.LeShine.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hwpf.extractor.WordExtractor;

/**
 * @author LeShine
 * @date: 2018��8��23�� ����5:10:48
 * @version: v1.0.0
 * @explain:poiTest.doc
 */
public class PoiTest {
	public static void main(String[] args) {
		File file = new File("E:\\bigdata\\exercise\\poiTest.doc");
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(file);
			WordExtractor wordExtractor = new WordExtractor(fileInputStream);
			String text = wordExtractor.getText();
			System.out.println(text);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
