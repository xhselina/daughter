package designpatterns.dip;

public class Mother {
	protected AReader aReader;

	public Mother() {
	};

	public Mother(AReader aReader) {
		this.aReader = aReader;
	}

	public void narrate(AReader reader) {
		System.out.println("妈妈开始讲：" + reader.getContent());
	}

	public void narrate() {
		System.out.println("妈妈开始讲：" + aReader.getContent());
	}
}
