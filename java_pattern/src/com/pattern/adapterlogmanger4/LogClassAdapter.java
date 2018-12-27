package com.pattern.adapterlogmanger4;

import java.util.List;

/**
 * 这是类适配器的实现；
 * 对于数据库操作jdb等过程暂不实现，这里主要注重模式的应用解决问题。
 * 由于是继承，且参数模板一致，因此可以直接调用。
 * @author yuanwm
 *
 */
public class LogClassAdapter extends LogOpera implements LogDbOperaApi {

	public LogClassAdapter(String logPathName) {
		super(logPathName);
	}
	
	@Override
	public void insertDbOpera(List<LogManage> loglist) {
		// TODO Auto-generated method stub
		System.out.println("以下日志已经插入数据库");
		System.out.println("log:" + loglist);
	}

	@Override
	public void updateDbOpera(List<LogManage> loglist) {
		// TODO Auto-generated method stub
		System.out.println("以下日志已经更新数据库");
		System.out.println("log:" + loglist);

	}

	@Override
	public void removeDbOpera(List<LogManage> loglist) {
		// TODO Auto-generated method stub
		System.out.println("以下日志已经从数据库删除");
		System.out.println("log:" + loglist);

	}

	@Override
	public List<LogManage> queryDblog() {
		// TODO Auto-generated method stub
		System.out.println("[测试]已经完成数据库数据查询");
		return null;
	}

}
