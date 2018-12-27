package com.pattern.adapterlogmanger3;

import java.util.List;

/**
 * 这是双向适配器的实现； 对于数据库操作jdb等过程暂不实现，这里主要注重模式的应用解决问题。 将Db操作实现为文件的方式，将file操作实现为db的方式；
 * 调用db的方法实际是文件操作，调用文件的方法实际是db的操作 暂时选择与原实现方法名一致，如果不一致也不影响。
 * 
 * @author yuanwm
 *
 */
public class LogBothwayAdapter implements LogDbOperaApi, LogOperaApi {

	private LogOperaApi logFileAdaptee;
	private LogDbOperaApi logDbAdaptee;

	public LogBothwayAdapter(LogOperaApi logFileAdaptee, LogDbOperaApi logDbAdaptee) {
		this.logFileAdaptee = logFileAdaptee;
		this.logDbAdaptee = logDbAdaptee;
	}

	/**
	 * db实现到文件的方法中
	 */

	public List<LogManage> readLogFile() {
		return logDbAdaptee.queryDblog();
	}

	public void WriteLogFile(List<LogManage> list) {
		logDbAdaptee.insertDbOpera(list);
	}

	/**
	 * file实现到Db的方法中
	 */
	@Override
	public void insertDbOpera(List<LogManage> loglist) {
		// TODO Auto-generated method stub
		logFileAdaptee.WriteLogFile(loglist);
	}

	@Override
	public void updateDbOpera(List<LogManage> loglist) {
		// TODO Auto-generated method stub
		List<LogManage> list = logFileAdaptee.readLogFile();
		for (int i = 0; i < loglist.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j).getLogSerialNo().equals(loglist.get(i).getLogSerialNo())) {
					list.set(j, loglist.get(i));
					break;
				}
			}
		}
	}

	@Override
	public void removeDbOpera(List<LogManage> loglist) {
		// TODO Auto-generated method stub
		List<LogManage> list = logFileAdaptee.readLogFile();
		for (LogManage tmplog : loglist) {
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j).getLogSerialNo().equals(tmplog.getLogSerialNo())) {
					list.remove(j);
					logFileAdaptee.WriteLogFile(list);
					break;
				}
			}
		}
	}

	@Override
	public List<LogManage> queryDblog() {
		// TODO Auto-generated method stub
		return logFileAdaptee.readLogFile();
	}

}
