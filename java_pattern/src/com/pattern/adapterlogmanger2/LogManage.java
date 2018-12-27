package com.pattern.adapterlogmanger2;

import java.io.Serializable;

/**
 * 日志管理对象
 * 
 * @author yuanwm
 */
public class LogManage implements Serializable {
	/**
	 * 实现 Serializable这个接口才能进行序列化。
	 */

	// 一个设为固定的 1L，另一个是随机生成一个不重复的 long 类型数据（实际上是使用 JDK 工具生成）。
	// 一般如果没有特殊需求，用默认的 1L 就可以，这样可以确保反序列化成功。因为不同的序列化id之间不能进行序列化和反序列化。
	private static final long serialVersionUID = 1L;

	private String logSerialNo; // 日志流水号
	private String logOperaUser; // 执行人员
	private String logOperaType; // 执行操作类型(更新/删除/插入等...)
	private String logOperaContent; // 执行操作内容
	private String logOperaTime; // 执行时间

	public String getLogSerialNo() {
		return logSerialNo;
	}

	public void setLogSerialNo(String logSerialNo) {
		this.logSerialNo = logSerialNo;
	}

	public String getLogOperaUser() {
		return logOperaUser;
	}

	public void setLogOperaUser(String logOperaUser) {
		this.logOperaUser = logOperaUser;
	}

	public String getLogOperaType() {
		return logOperaType;
	}

	public void setLogOperaType(String logOperaType) {
		this.logOperaType = logOperaType;
	}

	public String getLogOperaContent() {
		return logOperaContent;
	}

	public void setLogOperaContent(String logOperaContent) {
		this.logOperaContent = logOperaContent;
	}

	public String getLogOperaTime() {
		return logOperaTime;
	}

	public void setLogOperaTime(String logOperaTime) {
		this.logOperaTime = logOperaTime;
	}

	public String toString() {
		return "logSerialNo=" + logSerialNo + ",logOperaUser=" + logOperaUser + ",logOperaType=" + logOperaType + ","
				+ "logOperaContent=" + logOperaContent + "," + "logOperaTime=" + logOperaTime;
	}
}
