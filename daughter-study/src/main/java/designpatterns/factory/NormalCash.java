package designpatterns.factory;

public class NormalCash extends CashSuper {

	@Override
	public double acceptCash(Double money) {
		return money;
	}

}
