package designpatterns.strategy.impl;

import designpatterns.strategy.IStrategy;

public class GoHome implements IStrategy {

	@Override
	public void operate() {
		System.out.println("刘老爷子带着娇妻回蜀国happy...");

	}

}
