package com.pattern.adapterlogmanger2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 * 实现日志操作
 * 
 * @author yuanwm
 *
 */

public class LogOpera implements LogOperaApi {

	private String logFilePathName = null;

	public LogOpera(String inlogFilePathName) {
		// TODO Auto-generated constructor stub
		if (inlogFilePathName != null && inlogFilePathName.trim().length() > 0) {
			this.logFilePathName = inlogFilePathName;
		}
	}

	@Override
	public List<LogManage> readLogFile() {
		// TODO Auto-generated method stub
		List<LogManage> listManage = null;
		ObjectInputStream ioInputStream = null;
		try {
			File fpFile = new File(logFilePathName);
			if (fpFile.exists()) {
				ioInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fpFile)));
				listManage = (List<LogManage>) ioInputStream.readObject();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (ioInputStream != null) {
					ioInputStream.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return listManage;
	}

	@Override
	public void WriteLogFile(List<LogManage> list) {
		// TODO Auto-generated method stub
		File fpFile = new File(logFilePathName);
		ObjectOutputStream ioOutputStream = null;
		try {
			ioOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fpFile)));
			ioOutputStream.writeObject(list);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (ioOutputStream != null) {
					ioOutputStream.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
