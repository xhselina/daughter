package designpatterns.singleton;

public class Client extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			Singleton.getInstance();
		}
	}

	public static void main(String[] args) {
		new Client().run();
	}

}

