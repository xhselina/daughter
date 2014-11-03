package designpatterns.factory;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CashRebate cashRebate = new CashRebate(0.5d);
		double result = cashRebate.acceptCash(1000d);
		System.out.println(result);

	}

}
