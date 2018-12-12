package com.LeShine.test;

/**
 * @author LeShine
 * @date: 2018年8月17日 上午11:31:33
 * @version: v1.0.0
 * @explain:获取字符串中大小写及数字的个数
 */
public class getCountStr {
	public static void main(String[] args) {
		function("AdfdEEGZ4343a");
	}

	public static void function(String str) {
		int upper = 0;
		int lower = 0;
		int nums = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);// 根据索引取字符
			if (c >= 97 && c <= 122) {
				lower++;
			} else if (c >= 65 && c <= 90) {
				upper++;
			} else if (c >= 48 && c <= 57) {
				nums++;
			}
		}
		System.out.println("长度：" + str.length() + "  大写：" + upper + "  小写：" + lower + "  数字：" + nums);
	}
}
