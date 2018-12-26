package com.pattern.adapter;
/*
 * 被适配的类(USB5v电源输入)
 * @author yuanwm
 *
 */
public class Adaptee {
	public void SpecificRequest() {
		System.out.println("USB5v电源输入");
	}
}