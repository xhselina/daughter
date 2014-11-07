package designpatterns.strategy.impl;

import designpatterns.strategy.IStrategy;

/**
 * 
 * @author junhuiji
 *
 */
public class BackDoor implements IStrategy {

	@Override
	public void operate() {
		System.out.println("吴国老太开后门");
	}

}
