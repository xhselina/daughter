package designpatterns.strategy;

/**
 * 应用场景
 * @author junhuiji
 *
 */
public class Context {
	private IStrategy iStrategy;
	
	public Context(){}
	
	public Context(IStrategy iStrategy){
		this.iStrategy = iStrategy;
	}
	
	public void run(){
		this.iStrategy.operate();
	}
}
