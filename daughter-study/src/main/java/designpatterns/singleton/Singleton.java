package designpatterns.singleton;

public class Singleton {
	
	private static final Singleton SINGLETON = new Singleton();
	//防止随便new对象
	private Singleton(){}
	
	public synchronized static Singleton getInstance(){
		System.out.println(SINGLETON.toString());
		return SINGLETON;
	}
}
