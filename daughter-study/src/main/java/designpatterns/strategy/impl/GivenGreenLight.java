package designpatterns.strategy.impl;

import designpatterns.strategy.IStrategy;

public class GivenGreenLight implements IStrategy {

	@Override
	public void operate() {
		System.out.println("吴国老太开绿灯...");

	}

}
