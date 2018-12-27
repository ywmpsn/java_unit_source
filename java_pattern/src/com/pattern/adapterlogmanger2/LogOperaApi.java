package com.pattern.adapterlogmanger2;

import java.util.List;

/**
 * 日志操作的接口定义
 * 
 * @author yuanwm
 *
 */
public interface LogOperaApi {
	/**
	 * 读取日志文件，从文件里获取日志存储的对象
	 * 
	 * @return 存储日志的对象
	 */
	public List<LogManage> readLogFile();

	/**
	 * 写日志文件，将日志对象写到文件中
	 * 
	 * @param list 要写到日志文件的对象
	 */
	public void WriteLogFile(List<LogManage> list);

}
