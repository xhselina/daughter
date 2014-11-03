package designpatterns.dip;

public class Client {

	public static void main(String[] args) {
		Mother mother = new Mother(new NewPaper());
		mother.narrate(new Book());
		mother.narrate(new NewPaper());
		mother.narrate();

	}

}
