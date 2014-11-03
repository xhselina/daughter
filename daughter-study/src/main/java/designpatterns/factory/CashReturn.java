package designpatterns.factory;

public class CashReturn extends CashSuper {

	private double moneyCondition = 0.0d;
	private double moneyReturn = 0.0d;

	public CashReturn() {
		// TODO Auto-generated constructor stub
	}

	public CashReturn(double moneyCondition, double moneyReturn) {
		this.moneyCondition = moneyCondition;
		this.moneyReturn = moneyReturn;
	}

	@Override
	public double acceptCash(Double money) {
		return money - (money % moneyCondition * moneyReturn);
	}

}
