package designpatterns.lsp;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FatherClass fatherClass = new FatherClass();
		System.out.println("100-50=" + fatherClass.Subtraction(100, 50));
		System.out.println("100-80=" + fatherClass.Subtraction(100, 80));

		SonClass sonClass = new SonClass();
		System.out.println("100-50=" + sonClass.Subtraction(100, 50));

		System.out.println("100-80=" + sonClass.Subtraction(100, 80));

		System.out.println("100+20+100=" + sonClass.add(100, 20));
	}

}
