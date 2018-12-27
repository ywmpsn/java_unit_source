package com.pattern.adapterlogmanger2;

import java.util.List;

/**
 * 日志数据库操作API 新增，更新，删除，查询操作
 * 
 * @author yuanwm
 *
 */
public interface LogDbOperaApi {
	/**
	 * 新增
	 */
	public void insertDbOpera(List<LogManage> loglist);

	/**
	 * 更新
	 */
	public void updateDbOpera(List<LogManage> loglist);

	/**
	 * 删除
	 */
	public void removeDbOpera(List<LogManage> loglist);

	/**
	 * 查询所有日志
	 */
	public List<LogManage> queryDblog();

}
