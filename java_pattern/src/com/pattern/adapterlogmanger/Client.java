package com.pattern.adapterlogmanger;

import java.util.List;
import java.util.ArrayList;

/**
 * 客户端
 * @author yuanwm
 *
 */
public class Client {
	public static void main(String[] args) {
		//定义测试数据
		LogManage log = new LogManage();
		log.setLogSerialNo("001");
		log.setLogOperaUser("yuanwm");
		log.setLogOperaType("update");
		log.setLogOperaTime("2018-12-24 09:00:00");
		log.setLogOperaContent("更新一个表");
		
		List<LogManage> list = new ArrayList<LogManage>();
		list.add(log);
		
		//实例化日志操作对象
		LogOpera logApi = new LogOpera("./log.txt");
		
		//写日志
		logApi.WriteLogFile(list);
		
		//读取日志文件内容
		List<LogManage> readList = logApi.readLogFile();
		
		System.out.println("log="+readList);
		
	}
}
