package com.pattern.adapterlogmanger3;

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
		LogOperaApi logApi = new LogOpera("./log.txt");
		
		// 实例化数据库操作对象
		LogDbOperaApi dbApi = new LogDbOpera();
		
		// 进行添加进最最新的适配
		LogBothwayAdapter Adapter = new LogBothwayAdapter(logApi, dbApi);

		/**
		 * 数据库是配到文件。
		 */
		// 写日志
		Adapter.WriteLogFile(list);
		// 读取日志文件内容,这里没有实现数据库过程，因此暂时不输出
		Adapter.readLogFile();
		
		/**
		 * 文件适配到数据库
		 */
		// 插入
		Adapter.insertDbOpera(list);
		System.out.println("插入后:log=" + Adapter.queryDblog());
		
		// 更新
		Adapter.updateDbOpera(list);
		System.out.println("更新后:log=" + Adapter.queryDblog());

		// 删除
	    Adapter.removeDbOpera(list);  
		System.out.println("删除后:log=" + Adapter.queryDblog());

	}
}
