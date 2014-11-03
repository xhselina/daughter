package designpatterns.factory;

import java.util.Scanner;

public class MarketPay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入商品价格:");
		int price = in.nextInt();
		System.out.println("请输入数量:");
		int num = in.nextInt();
		System.out.println("请输入打折信息:");
		double sale = in.nextDouble();
		System.out.println("总价格是:" + price * num * sale);

	}

}
