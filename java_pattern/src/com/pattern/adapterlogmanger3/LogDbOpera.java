package com.pattern.adapterlogmanger3;

/**
 * 对logdb操作的简单实现
 * 具体操作数据库的方式暂不实现，注重模式的应用解决问题
 */
import java.util.List;

public class LogDbOpera implements LogDbOperaApi {

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
