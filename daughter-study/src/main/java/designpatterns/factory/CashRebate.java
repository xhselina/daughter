package designpatterns.factory;

public class CashRebate extends CashSuper {

	private double moneyRebate;

	public CashRebate() {
		// TODO Auto-generated constructor stub
	}

	public CashRebate(double moneyRebate) {
		this.moneyRebate = moneyRebate;
	}

	@Override
	public double acceptCash(Double money) {
		return moneyRebate * money;
	}

}
