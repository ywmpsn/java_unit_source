package com.pattern.adapter;
/*
 * 客户端类(手机)
 * main逻辑中处理:手机-》miniUSB接口-》miniUSB与USB适配器-》USB5v电源输入，获取电量
 * 其中分为类适配器与对象适配器
 * @author yuanwm
 *
 */
public class Client {
	public void DoRequest(Target ObTarget) {
		ObTarget.Request();
	}
	public static void main(String[] args) {
		Client computerClient = new Client();

		//类适配器
		AdapterClass pspToUsbClassAdapter = new AdapterClass();
		System.out.println("类适配充电:");
		computerClient.DoRequest(pspToUsbClassAdapter);
		
		Adaptee pspKeyboardAdaptee = new Adaptee();
		//对象配器
		System.out.println("类适配充电:");
		AdapterObject pspToUsbObjectAdapter = new AdapterObject(pspKeyboardAdaptee);
		
		computerClient.DoRequest(pspToUsbObjectAdapter);
	}
}
