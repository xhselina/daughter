package designpatterns.lsp;

public class SonClass extends FatherClass {

	public int Subtraction(int a, int b) {
		return a + b;
	}

	public int add(int a, int b) {
		return Subtraction(a, b) + 100;
	}
}
