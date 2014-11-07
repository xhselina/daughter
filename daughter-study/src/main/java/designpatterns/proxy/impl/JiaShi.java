package designpatterns.proxy.impl;

import designpatterns.proxy.IBadWoman;

/**
 * 坏女人 贾氏
 * @author junhuiji
 *
 */
public class JiaShi implements IBadWoman {

	@Override
	public void makeEyesWithMan() {
		System.out.println("贾氏在抛媚眼...");

	}

	@Override
	public void happyWithMan() {
		System.out.println("贾氏在Happy...");

	}

}
