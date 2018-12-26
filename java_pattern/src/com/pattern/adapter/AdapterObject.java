package com.pattern.adapter;
/*
 * 对象适配器实现(miniUSB与USB适配器)
 * @author yuanwm
 *
 */

public class AdapterObject implements Target{
/**
* 对象适配器，通过对象组合的方式
*/
	private Adaptee objectAdaptee;
	
	public AdapterObject(Adaptee inAdaptee) {
		super();
		this.objectAdaptee = inAdaptee;
	}
	
	@Override
	public void Request() {
		// TODO Auto-generated method stub
		objectAdaptee.SpecificRequest();
	}


}

