package com.LeShine.test;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author LeShine
 * @date: 2018��8��23�� ����6:38:48
 * @version: v1.0.0
 * @explain:JDBC
 */
public class JDBCTest {
	public static void main(String[] args) {
		java.sql.Connection conn = null;// coon �������ݿ�
		java.sql.Statement sta = null;// ����sql��䵽���ݿⲢִ��
		ResultSet rSet = null;// ��ȡ��������
		// ���ݿ�����
		String connString = "jdbc:mysql://127.0.0.1:3306/mysql?"
				+ "user=root&password=Mysql007&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false";
		try {
			// ͨ�����䴴�����ݿ�ʵ��
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			// ���������������ݿ�ʵ��ͨ��connString����
			conn = DriverManager.getConnection(connString);
			// ͨ�����ӽ���sta������ִ��sql
			sta = conn.createStatement();
			String query = "select * from help_relation limit 12 ";
			rSet = sta.executeQuery(query);
			if (rSet != null) {
				// ��ȡ��ѯ���
				rSet = sta.getResultSet();
				while (rSet.next()) {
					// ��ȡֵ
					System.out.println(rSet.getString("help_topic_id"));
				}
			}
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rSet.close();
				sta.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}