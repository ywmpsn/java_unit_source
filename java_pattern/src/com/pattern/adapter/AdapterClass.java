package com.pattern.adapter;
/*
 * 类适配器实现（miniUSB与USB适配器）
 * @author yuanwm
 *
 */

public class AdapterClass extends Adaptee implements Target{
/*
 * 类适配器-通过继承的方式
 * Java为单继承，因此一个类的继承机会只有一次；因此，不建议使用这种方式。
 */
	@Override
	public void Request() {
		// TODO Auto-generated method stub
		super.SpecificRequest();
	}

}