package designpatterns.proxy.impl;

import designpatterns.proxy.IBadWoman;

/**
 * 坏女人 潘金莲
 * @author junhuiji
 *
 */
public class PanJinLian implements IBadWoman {

	@Override
	public void makeEyesWithMan() {
		System.out.println("潘金莲抛媚眼...");

	}

	@Override
	public void happyWithMan() {
		System.out.println("潘金莲在Happy...");

	}

}
