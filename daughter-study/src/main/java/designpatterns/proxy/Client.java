package designpatterns.proxy;

import designpatterns.proxy.impl.JiaShi;
import designpatterns.proxy.impl.ProxyBadWoman;

public class Client {

	public static void main(String[] args) {
		//代理人出场
		ProxyBadWoman proxyBadWoman = new ProxyBadWoman();
		proxyBadWoman.makeEyesWithMan();
		proxyBadWoman.happyWithMan();
		//代理贾氏
		proxyBadWoman = new ProxyBadWoman(new JiaShi());
		proxyBadWoman.makeEyesWithMan();
		proxyBadWoman.happyWithMan();

	}

}
