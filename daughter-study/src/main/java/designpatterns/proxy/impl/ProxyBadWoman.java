package designpatterns.proxy.impl;

import designpatterns.proxy.IBadWoman;

/**
 * 坏女人的代理类   王婆    老鸨。。。
 * @author junhuiji
 *
 */
public class ProxyBadWoman implements IBadWoman {

	/**
	 * 代理的坏女人
	 */
	private IBadWoman badWoman;
	public ProxyBadWoman() {
		//默认代理 潘金莲
		this.badWoman = new PanJinLian();
	}
	public ProxyBadWoman(IBadWoman badWoman) {
		this.badWoman = badWoman;
	}
	
	
	@Override
	public void makeEyesWithMan() {
		this.badWoman.makeEyesWithMan();

	}

	@Override
	public void happyWithMan() {
		this.badWoman.happyWithMan();

	}

}
