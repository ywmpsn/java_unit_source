package com.pattern.adapterlogmanger2;

import java.util.List;

import java.util.ArrayList;

/**
 * 客户端
 * 
 * @author yuanwm
 *
 */
public class Client {
	public static void main(String[] args) {
		// 定义测试数据
		LogManage log = new LogManage();
		log.setLogSerialNo("001");
		log.setLogOperaUser("yuanwm");
		log.setLogOperaType("update");
		log.setLogOperaTime("2018-12-24 09:00:00");
		log.setLogOperaContent("更新一个表");

		List<LogManage> list = new ArrayList<LogManage>();
		list.add(log);

		// 实例化文件日志操作对象
		LogOpera logApi = new LogOpera("./log.txt");
		
		// 进行添加进最最新的适配
		LogAdapter Adapter = new LogAdapter(logApi);

		/**
		 * 原文件操作方式
		 */
		// 写日志
		Adapter.WriteLogFile(list);
		// 读取日志文件内容
		List<LogManage> readList = Adapter.readLogFile();

		System.out.println("log=" + readList);
		
		/**
		 * 目前数据库的操作方式
		 */
		// 插入
		Adapter.insertDbOpera(list);
		
		// 更新
		Adapter.updateDbOpera(list);
		
		// 删除
		Adapter.removeDbOpera(list);
		
		// 查询
		Adapter.queryDblog();
	}
}
