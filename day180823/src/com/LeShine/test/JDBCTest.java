package com.LeShine.test;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author LeShine
 * @date: 2018年8月23日 下午6:38:48
 * @version: v1.0.0
 * @explain:JDBC
 */
public class JDBCTest {
	public static void main(String[] args) {
		java.sql.Connection conn = null;// coon 连接数据库
		java.sql.Statement sta = null;// 发送sql语句到数据库并执行
		ResultSet rSet = null;// 获取返回数据
		// 数据库配置
		String connString = "jdbc:mysql://127.0.0.1:3306/mysql?"
				+ "user=root&password=Mysql007&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false";
		try {
			// 通过反射创建数据库实例
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			// 驱动管理器把数据库实例通过connString连接
			conn = DriverManager.getConnection(connString);
			// 通过连接建立sta，用于执行sql
			sta = conn.createStatement();
			String query = "select * from help_relation limit 12 ";
			rSet = sta.executeQuery(query);
			if (rSet != null) {
				// 获取查询结果
				rSet = sta.getResultSet();
				while (rSet.next()) {
					// 获取值
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
