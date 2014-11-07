package designpatterns.strategy;

import designpatterns.strategy.impl.BackDoor;
import designpatterns.strategy.impl.GivenGreenLight;
import designpatterns.strategy.impl.GoHome;

public class Client {

	public static void main(String[] args) {
		System.out.println("赵云护送刘备去吴国娶亲...");
		System.out.println("赵云打开第一个锦囊...");
		Context context = new Context(new BackDoor());
		context.run();
		System.out.println("赵云打开第二个锦囊...");
		context = new Context(new GivenGreenLight());
		context.run();
		System.out.println("赵云打开第三个锦囊...");
		context = new Context(new GoHome());
		context.run();
	}

}
